import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String nextLine = scanner.nextLine();
        Set<String> guestList = new TreeSet<>();
        while (!"PARTY".equals( nextLine.trim() )) {
            guestList.add( nextLine.trim() );
            nextLine = scanner.nextLine();
        }
        while (!"END".equals( nextLine )) {
            if (guestList.contains( nextLine.trim() )) {
                guestList.remove( nextLine );
            }
            nextLine=scanner.nextLine();
        }
        System.out.println(guestList.size());
        for (String s : guestList) {
            System.out.println(s);
        }

    }
}
