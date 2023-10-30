package produtosimples;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int a = t.nextInt();
        int b = t.nextInt();

        System.out.println("PROD = " + (a * b));


    }

}