package easy.diferença;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        int a = t.nextInt();
        int b = t.nextByte();
        int c = t.nextInt();
        int d = t.nextInt();
        System.out.println("DIFERENCA = " + (a*b - c*d));
    }

}
