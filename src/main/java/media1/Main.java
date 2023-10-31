package media1;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ENGLISH);

        Scanner t = new Scanner(System.in);

        double a = t.nextDouble();
        double b = t.nextDouble();

        System.out.printf("MEDIA = %.5f\n", (a * 3.5 + b * 7.5) / 11);
    }
}
