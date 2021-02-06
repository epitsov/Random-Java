import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int input = Integer.parseInt( scanner.nextLine() );
        Pattern pattern = Pattern.compile( "\\!(?<command>[A-Z][a-z]{3,})!:\\[(?<text>[A-Za-z]{8,})\\]" );
        for (int i = 0; i < input; i++) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher( line );
            if (matcher.find()) {
                String command=matcher.group("command");
                String text=matcher.group("text");
                System.out.print(String.format( "%s: " ,command));
                for (int j = 0; j <text.length() ; j++) {
                    int x=text.charAt(j );
                    System.out.print(x+" ");
                }
                System.out.println();
            } else {
                System.out.println( "The message is invalid" );
            }

        }
    }
}
