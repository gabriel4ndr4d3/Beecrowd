package easy.ddd;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        DDD[] ddds = {
                new DDD(61, "Brasilia"),
                new DDD(71, "Salvador"),
                new DDD(11, "Sao Paulo"),
                new DDD(21, "Rio de Janeiro"),
                new DDD(32, "Juiz de Fora"),
                new DDD(19, "Campinas"),
                new DDD(27, "Vitoria"),
                new DDD(31, "Belo Horizonte"),
        };

        int code = teclado.nextInt();

        for (int i = 0; i < ddds.length; i++) {
            DDD ddd = ddds[i];

            if (code == ddd.getDdd()) {
                System.out.println(ddd.getCidade());
                return;
            }
        }

        System.out.println("DDD nao cadastrado");
    }
}

class DDD {

    private final int ddd;
    private final String cidade;

    public DDD(int ddd, String cidade) {

        this.ddd = ddd;
        this.cidade = cidade;
    }

    public int getDdd() {
        return ddd;
    }

    public String getCidade() {
        return cidade;
    }
}