package conversaotempo;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        long value = t.nextLong();

        long hours = TimeUnit.SECONDS.toHours(value);

        value -= TimeUnit.HOURS.toSeconds(hours);

        long minutes = TimeUnit.SECONDS.toMinutes(value);

        value -= TimeUnit.MINUTES.toSeconds(minutes);

        long seconds = TimeUnit.SECONDS.toSeconds(value);

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
