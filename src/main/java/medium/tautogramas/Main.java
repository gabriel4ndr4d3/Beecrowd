package medium.tautogramas;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner tecla = new Scanner(System.in);

        String frase;

        do {

            frase = tecla.nextLine();

            if (frase.equals("*")) break;

            if (verificarTautograma(frase)) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }

        } while (true);

    }

    private static boolean verificarTautograma(String frase) {
        String[] palavras = frase.split(" ");
        char primeiraLetra = palavras[0].charAt(0);

        for (String palavra : palavras) {
            if (!equalsIgnoreCase(palavra.charAt(0), primeiraLetra)) {
                return false;
            }
        }

        return true;
    }

    private static boolean equalsIgnoreCase(char a, char b) {

        return String.valueOf(a).equalsIgnoreCase(String.valueOf(b));
    }
}

