package tempojogo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int start = Integer.parseInt(t.next());
        int end = Integer.parseInt(t.next());

        int total;

        if (end > start) {
            total = end - start;
        } else {
            total = 24 - start + end;
        }

        System.out.println("O JOGO DUROU " + total + " HORA(S)");
    }
}