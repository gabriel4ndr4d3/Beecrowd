package formulabaskara;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        double a = t.nextDouble();
        double b = t.nextDouble();
        double c = t.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("Impossivel calcular");
        } else if (delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1,r2);
        }
    }

}

