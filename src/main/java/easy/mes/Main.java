package easy.mes;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        Month[] months = {
                new Month(1, "January"),
                new Month(2, "February"),
                new Month(3, "March"),
                new Month(4, "April"),
                new Month(5, "May"),
                new Month(6, "June"),
                new Month(7, "July"),
                new Month(8, "August"),
                new Month(9, "September"),
                new Month(10, "October"),
                new Month(11, "November"),
                new Month(12, "December")
        };

        int monthNumber = teclado.nextInt();

        for (Month month : months) {
            if (monthNumber == month.getNumber()) {
                System.out.println(month.getName());
                return;
            }

        }

    }

    static class Month {

        private final int number;
        private final String name;

        public Month(int number, String name) {

            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }
    }

}
