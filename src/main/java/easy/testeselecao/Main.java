package easy.testeselecao;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
        int d = t.nextInt();

        int somaCd = c + d;
        int somaAb = a + b;

        if (b > c && d > a) {
            if (somaCd > somaAb) {
                if (c > 0 && d > 0) {
                    if (a % 2 == 0) {
                        System.out.println("Valores aceitos ");
                        return;
                    }
                }
            }
        }

        System.out.println("Valores nao aceitos");
    }
}
