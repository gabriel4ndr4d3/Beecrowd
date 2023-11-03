package calculosimples;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) throws IOException {
        scanner = new Scanner(System.in);

        double total = 0.0;

        for (int i = 0; i < 2; i++) {
            String input = scanner.nextLine();

            String[] inputs = input.split("\\s");

            int partCode = Integer.parseInt(inputs[0]);
            int numberParts = Integer.parseInt(inputs[1]);
            double partPrice = Double.parseDouble(inputs[2]);

            total += numberParts * partPrice;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }

}
