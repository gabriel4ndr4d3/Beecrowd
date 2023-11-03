package omaior;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();

        List<Integer> values = Arrays.asList(a, b, c);

        values.sort(Integer::compare);

        int better = values.get(values.size() - 1);

        System.out.println(better + " eh o maior");
    }
}
