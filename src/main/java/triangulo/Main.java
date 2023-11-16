package triangulo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        double a = Double.parseDouble(t.next());
        double b = Double.parseDouble(t.next());
        double c = Double.parseDouble(t.next());

        if (a >= b + c) {
            System.out.println("Area = " + ((a + b) * c / 2));
            return;
        }
        if (b >= a + c) {
            System.out.println("Area = " + ((a + b) * c / 2));
            return;
        }
        if (c >= a + b) {
            System.out.println("Area = " + ((a + b) * c / 2));
            return;
        }

        System.out.println("Perimetro = " + (a + b + c));
    }
}
