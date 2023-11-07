package cedulas;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int value = t.nextInt();

        System.out.println(value);

        int cedulas = value / 100;
        value -= cedulas * 100;

        System.out.println(cedulas + " nota(s) de R$ 100,00");

        int cedulas2 = value / 50;
        value -= cedulas2 * 50;

        System.out.println(cedulas2 + " nota(s) de R$ 50,00");

        int cedulas3 = value / 20;
        value -= cedulas3 * 20;

        System.out.println(cedulas3 + " nota(s) de R$ 20,00");

        int cedulas4 = value / 10;
        value -= cedulas4 * 10;

        System.out.println(cedulas4 + " nota(s) de R$ 10,00");

        int cedulas5 = value / 5;
        value -= cedulas5 * 5;

        System.out.println(cedulas5 + " nota(s) de R$ 5,00");

        int cedulas6 = value / 2;
        value -= cedulas6 * 2;

        System.out.println(cedulas6 + " nota(s) de R$ 2,00");

        System.out.println(value + " nota(s) de R$ 1,00");
    }
}
