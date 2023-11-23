package numerospositivos;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        double one = teclado.nextDouble();
        double two = teclado.nextDouble();
        double three = teclado.nextDouble();
        double four = teclado.nextDouble();
        double five = teclado.nextDouble();
        double six = teclado.nextDouble();

        double[] numbers = {one, two, three, four, five, six};

        int count = 0;

        for (double number : numbers) {
            if (number > 0) {
                count++;
            }
        }

        System.out.println(count + " valores positivos");
    }
}
