package easy.media2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        double a = t.nextDouble();
        double b = t.nextDouble();
        double c = t.nextDouble();

        System.out.printf("MEDIA = %.1f\n",(a*2 + b*3 + c*5 )/10);

    }
}
