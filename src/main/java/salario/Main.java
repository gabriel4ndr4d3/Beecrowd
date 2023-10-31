package salario;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ENGLISH);

        Scanner t = new Scanner(System.in);

        int number = t.nextInt();

        int hours = t.nextInt();

        double valueForHour = t.nextDouble();

        double salary = hours * valueForHour;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n",salary);

    }
}
