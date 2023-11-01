package consumo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int x = t.nextInt();
        double y = t.nextDouble();

        System.out.printf("%.3f km/l\n",x / y);

    }
}
