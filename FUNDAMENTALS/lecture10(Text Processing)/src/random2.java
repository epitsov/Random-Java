import java.util.Date;
import java.util.Scanner;

public class random2 {
    public static void main(String[] args) {
        Date start = new Date();
        String s = repeat("abv", 100000000);
        Date end = new Date();
        System.out.println(end.getTime()-start.getTime());

    }

    static String repeat(String s, int repeatCount) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            repeated .append(s);
        }

        return repeated.toString();
    }
}
