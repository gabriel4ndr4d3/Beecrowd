package omaior;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();

        int first = (a + b + Math.abs(a - b)) / 2;

        if (first > c) {
            System.out.println(first + " eh o maior");

        } else {
            System.out.println(c + " eh o maior");
        }
    }
}
