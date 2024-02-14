package easy.distanciadoispontos;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        double x1 = Double.parseDouble(t.next());
        double y1 = Double.parseDouble(t.next());

        double x2 = Double.parseDouble(t.next());
        double y2 = Double.parseDouble(t.next());

        double result = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));

        System.out.printf("%.4f\n", result);
    }
}
