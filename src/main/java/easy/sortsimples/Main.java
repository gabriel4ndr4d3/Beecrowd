package easy.sortsimples;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();

        List<Integer> sorted = Arrays.asList(a, b, c);

        sorted.sort(Integer::compare);

        show(sorted);

        System.out.println();

       show(Arrays.asList(a, b, c));
    }

    private static void show(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
