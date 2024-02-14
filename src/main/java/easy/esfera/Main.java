package easy.esfera;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        double raio = t.nextDouble();
        double pi = 3.14159;

        System.out.printf("VOLUME = %.3f\n", Math.pow(raio, 3) * pi * (4.0 / 3));

    }
}
