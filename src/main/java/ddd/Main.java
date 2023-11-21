package ddd;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int code = teclado.nextInt();

        if (code == 61){
            System.out.println("Brasilia");
            return;
        }
        if (code == 71){
            System.out.println("Salvador");
            return;
        }
        if (code == 11){
            System.out.println("Sao Paulo");
            return;
        }
        if (code == 21){
            System.out.println("Rio de Janeiro");
            return;
        }
        if (code == 32){
            System.out.println("Juiz de Fora");
            return;
        }
        if (code == 19){
            System.out.println("Campinas");
            return;
        }
        if (code == 27){
            System.out.println("Vitoria");
            return;
        }
        if (code == 31){
            System.out.println("Belo Horizonte");
        }

        System.out.println("DDD nao cadastrado");
    }
}
