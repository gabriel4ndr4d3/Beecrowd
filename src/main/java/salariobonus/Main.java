package salariobonus;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        String name = t.next();
        double salary = t.nextDouble();
        double sales = t.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", salary + sales * 0.15);
    }
}
