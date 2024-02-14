package easy.area;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        double a = t.nextDouble();
        double b = t.nextDouble();
        double c = t.nextDouble();

        calcularTriangulo(a, c);
        calcularCirculo(c);
        calcularTrapezio(a, b, c);
        calcularQuadrado(b);
        calcularRetangulo(a, b);


    }

    static void calcularTriangulo(double a, double b) {
        System.out.printf("TRIANGULO: %.3f\n", (a * b / 2));
    }

    static void calcularCirculo(double raio) {
        double pi = 3.14159;

        double area = pi * Math.pow(raio, 2);

        System.out.printf("CIRCULO: %.3f\n", area);
    }

    static void calcularTrapezio(double a, double b, double c) {

        System.out.printf("TRAPEZIO: %.3f\n", (a + b) * c / 2);

    }

    static void calcularQuadrado(double a) {

        System.out.printf("QUADRADO: %.3f\n", Math.pow(a, 2));
    }

    static void calcularRetangulo(double a, double b) {

        System.out.printf("RETANGULO: %.3f\n", a * b);
    }

}
