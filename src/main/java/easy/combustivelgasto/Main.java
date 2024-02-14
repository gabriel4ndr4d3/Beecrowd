package easy.combustivelgasto;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        double tempo = t.nextDouble();
        double velocidade = t.nextDouble();

        System.out.printf("%.3f\n", tempo * velocidade / 12);

    }
}
