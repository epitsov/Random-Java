import java.util.LinkedHashSet;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = Integer.parseInt( scanner.nextLine() );
        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        while (n-- > 0) {
            String username = scanner.nextLine();
            usernames.add( username );

        }
        usernames
                .forEach( System.out::println );

    }
}
