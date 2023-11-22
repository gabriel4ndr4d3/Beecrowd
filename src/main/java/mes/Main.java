package mes;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int month = teclado.nextInt();

        if (month == 1) {
            System.out.println("January");
            return;
        }
        if (month == 2) {
            System.out.println("February");
            return;
        }
        if (month == 3) {
            System.out.println("March");
            return;
        }
        if (month == 4) {
            System.out.println("April");
            return;
        }
        if (month == 5) {
            System.out.println("May");
            return;
        }
        if (month == 6) {
            System.out.println("June");
            return;
        }
        if (month == 7) {
            System.out.println("July");
            return;
        }
        if (month == 8) {
            System.out.println("August");
            return;
        }
        if (month == 9) {
            System.out.println("September");
            return;
        }
        if (month == 10) {
            System.out.println("October");
            return;
        }
        if (month == 11) {
            System.out.println("November");
            return;
        }
        if (month == 12) {
            System.out.println("December");
        }

    }
}
