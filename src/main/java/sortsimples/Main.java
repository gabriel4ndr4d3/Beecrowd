package sortsimples;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();

        List<Integer> sorted = Arrays.asList(a, b, c);

        List<Integer> original = Arrays.asList(a, b, c);

        sorted.sort(Integer::compare);

        for (int i = 0; i < sorted.size(); i++) {
            System.out.println(sorted.get(i));
        }

        System.out.println();

        for (int i = 0; i < original.size(); i++) {
            System.out.println(original.get(i));
        }

    }
}
