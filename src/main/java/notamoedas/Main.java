package notamoedas;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        BigDecimal value = new BigDecimal(String.valueOf(t.nextDouble()))
                .setScale(2, RoundingMode.HALF_UP);

        double[] cedulas = {-1, 100, 50, 20, 10, 5, 2, -2, 1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        for (double valorCedula : cedulas) {

            if (valorCedula == -2) {
                System.out.println("MOEDAS:");
                continue;
            }

            if (valorCedula == -1) {
                System.out.println("NOTAS:");
                continue;
            }

            int numeroDeCedulas =  value.divide(
                    BigDecimal.valueOf(valorCedula),
                    RoundingMode.FLOOR
            ).toBigInteger().intValue();

            value = value.subtract(BigDecimal.valueOf(numeroDeCedulas * valorCedula));

            System.out.printf(
                    "%d %s(s) de R$ %.2f\n",
                    numeroDeCedulas,
                    valorCedula > 1 ? "nota" : "moeda",
                    valorCedula
            );
        }

    }
}