package animal;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        String word1 = t.next();
        String word2 = t.next();
        String word3 = t.next();


        if (word1.equals("vertebrado") && word2.equals("ave") && word3.equals("carnivoro")) {
            System.out.println("aguia");
            return;
        }
        if (word1.equals("vertebrado") && word2.equals("ave") && word3.equals("onivoro")) {
            System.out.println("pomba");
            return;
        }
        if (word1.equals("vertebrado") && word2.equals("mamifero") && word3.equals("onivoro")) {
            System.out.println("homem");
            return;
        }
        if (word1.equals("vertebrado") && word2.equals("mamifero") && word3.equals("herbivoro")) {
            System.out.println("vaca");
            return;
        }
        if (word1.equals("invertebrado") && word2.equals("inseto") && word3.equals("hematofago")) {
            System.out.println("pulga");
            return;
        }
        if (word1.equals("invertebrado") && word2.equals("inseto") && word3.equals("herbivoro")) {
            System.out.println("lagarta");
            return;
        }
        if (word1.equals("invertebrado") && word2.equals("anelideo") && word3.equals("hematofago")) {
            System.out.println("sanguessuga");
            return;
        }
        if (word1.equals("invertebrado") && word2.equals("anelideo") && word3.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}
