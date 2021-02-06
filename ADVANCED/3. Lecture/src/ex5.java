import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String input = scanner.nextLine();
        Map<String, String> phoneBook = new LinkedHashMap<>();
        while (!input.equals( "search" )) {
            String[] tokens = input.split( "-" );
            phoneBook.putIfAbsent( tokens[0], tokens[1] );
            phoneBook.put( tokens[0], tokens[1] );
            input = scanner.nextLine();
        }
        String input1 = scanner.nextLine();
        while (!input1.equals( "stop" )) {
            if(phoneBook.containsKey( input1 ))
            {
                System.out.println(String.format( "%s -> %s",input1,phoneBook.get( input1 )));
            }
            else
            {
                System.out.println(String.format( "Contact %s does not exist.",input1));
            }

            input1 = scanner.nextLine();
        }
    }
}
