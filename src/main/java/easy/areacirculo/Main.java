package easy.areacirculo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        double raio = t.nextDouble();

        double r = 3.14159;

        double area = r * Math.pow(raio,2);
        System.out.printf("A=%.4f%n", area);
    }
}
