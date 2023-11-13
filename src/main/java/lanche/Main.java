package lanche;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        double[] prices = {4, 4.50, 5, 2, 1.50};

        int code = Integer.parseInt(t.next());
        int amount = Integer.parseInt(t.next());

        double price = prices[code-1];

        double total = price * amount;

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
