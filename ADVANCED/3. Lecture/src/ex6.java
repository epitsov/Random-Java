import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String input = scanner.nextLine();
        String regex = "^(?<name>\\w+)@(?<email>\\w+).(?<domain>\\w+)";
        Map<String, String> emails = new HashMap<>();
        Pattern pattern = Pattern.compile( regex );
        while (!input.equals( "stop" )) {
            String input1 = scanner.nextLine();
            Matcher matcher = pattern.matcher( input1 );
            String domain = matcher.group( "domain" ).trim();
            if (!domain.equals( "us" )
                    || !domain.equals( "uk" )
                    || !domain.equals( "com" )) {
                emails.put( input, input1 );
            }
            input = scanner.nextLine();
        }
    }
}
