import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class additional1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String line = scanner.nextLine();
        Map<String, String> passwords = new HashMap<>();
        Map<String, Integer> courses = new HashMap<>();
        Map<String, Integer> bestcandidate = new HashMap<>();

        while (!"end of contests".equals( line )) {
            String[] tokens = line.split( ":" );
            String contestName = tokens[0];
            String contestPass = tokens[1];
            passwords.put( contestName, contestPass );
            line = scanner.nextLine();
        }
        String line1 = scanner.nextLine();
        while (!"end of submissions".equals( line1 )) {
            String[] tokens = line1.split( "=>" );
            String contestName = tokens[0];
            String pass = tokens[1];
            String username = tokens[2];
            int points = Integer.parseInt( tokens[3] );
            if (passwords.containsKey( contestName )) {
                if (passwords.get( contestName ).equals( pass )) {



            }


            line1 = scanner.nextLine();
        }
        System.out.println();
    }
}
