package easy.tempojogominutos;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        int startHours = Integer.parseInt(t.next());
        int startMinutes = Integer.parseInt(t.next());
        int endHours = Integer.parseInt(t.next());
        int endMinutes = Integer.parseInt(t.next());

        int hours = 0;
        int minutes;

        if (endMinutes >= startMinutes) {
            minutes = endMinutes - startMinutes;
        } else {
            minutes = 60 - startMinutes + endMinutes;
            hours--;
        }

        if (endHours + endMinutes / 60f > startHours + startMinutes / 60f) {
            hours += endHours - startHours;
        } else {
            hours += 24 - startHours + endHours;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hours, minutes);
    }
}
