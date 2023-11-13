package coordenadasdeponto;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner t = new Scanner(System.in);

        double x = Double.parseDouble(t.next());
        double y = Double.parseDouble(t.next());

        if (x == 0 && y == 0) {
            System.out.println("Origem");
            return;
        }

        if (x == 0) {
            System.out.println("Eixo Y");
            return;
        }

        if (y == 0) {
            System.out.println("Eixo X");
            return;
        }

        if (x > 0) {
            if (y > 0) {
                System.out.println("Q1");
            } else {
                System.out.println("Q4");
            }
        }
        if (x < 0){
            if (y > 0) {
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            }
        }
    }
}
