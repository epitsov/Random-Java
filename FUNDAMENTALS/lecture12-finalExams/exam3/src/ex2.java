import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int input = Integer.parseInt( scanner.nextLine() );
        Pattern pattern = Pattern.compile( "\\|(?<boss>[A-Z]{4,})\\|:\\#(?<random>[A-Za-z]+ [A-Za-z]+)\\#" );
        for (int i = 0; i < input; i++) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher( line );
            if (matcher.find()) {
                String strenght = matcher.group( "boss" );
                String armour = matcher.group( "random" );


                System.out.println(String.format( "%s, The %s",strenght,armour ));
                System.out.println(String.format( ">> Strength: %d",strenght.length() ));
                System.out.println(String.format( ">> Armour: %d",armour.length() ));
            } else {
                System.out.println( "Access denied!" );
            }

        }
    }
}
