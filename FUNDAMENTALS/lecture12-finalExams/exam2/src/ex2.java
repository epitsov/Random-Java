import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Pattern pattern = Pattern.compile( "(.+)>(?<f>[0-9]{3})\\|(?<s>[a-z]{3})\\|(?<t>[A-Z]{3})\\|?(?<fr>[^><]{3})<\\1$" );
        int n = Integer.parseInt( scanner.nextLine() );
        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();
            Matcher matcher = pattern.matcher( password );
            if(matcher.find())
            {String first=matcher.group("f");
            String second=matcher.group("s");
            String third=matcher.group("t");
            String fourth=matcher.group("fr");
                System.out.println(String.format( "Password: %s%s%s%s",first,second,third,fourth ));

            }
            else
            {
                System.out.println("Try another password!");
            }
        }
    }
}
