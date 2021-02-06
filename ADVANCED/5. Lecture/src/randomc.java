import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class randomc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int i = 0;
        long n = Long.parseLong( scanner.nextLine() );
        long x=n/1000000000;
        System.out.println(x);
        while (n > 0) {
            i++;
            n /= 10;
        }

    }
}
