package easy.cedulas;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int value = t.nextInt();

        System.out.println(value);

        int[] cedulas = { 100, 50, 20, 10, 5, 2, 1};

        for (int valorCedula : cedulas) {

            int numeroDeCedula = value / valorCedula;

            value -= numeroDeCedula * valorCedula;

            System.out.printf("%s nota(s) de R$ %s,00\n", numeroDeCedula, valorCedula);
        }
    }
}
