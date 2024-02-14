package easy.idadedias;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int idade = t.nextInt();

        int year = (int) Math.floor(idade / 365f);
        idade -= year * 365;

        System.out.println(year + " ano(s)");

        int month = (int) Math.floor(idade / 30f);
        idade -= month * 30;

        System.out.println(month + " easy.mes(es)");

        System.out.println(idade+ " dia(s)");


    }
}
