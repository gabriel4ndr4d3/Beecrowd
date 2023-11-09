package intervalo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        double value = t.nextDouble();

        if (value >= 0 && value <= 25) {
            System.out.println("Intervalo [0,25]");
            return;
        }

        if (value > 25 && value <= 50 ) {
            System.out.println("Intervalo (25,50]");
            return;
        }

        if (value > 50 && value <= 57 ){
            System.out.println("Intervalo (50,75]");
            return;
        }

        if (value > 75 && value <= 100 ){
            System.out.println(("Intervalo (75,100]"));
            return;
        }

        System.out.println("Fora de intervalo");
    }
}
