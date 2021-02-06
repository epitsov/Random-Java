import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String userName = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals( "Sign up" )) {
            String[] tokens = input.split( "\\s+" );
            String command = tokens[0];
            switch (command) {
                case "Case":
                    if ("lower".equals( tokens[1] )) {
                        userName = userName.toLowerCase();
                    } else {
                        userName = userName.toUpperCase();
                    }
                    System.out.println( userName );
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt( tokens[1] );
                    int endIndex = Integer.parseInt( tokens[2] );
                    if (startIndex >= 0 && endIndex < userName.length()) {
                        String results = userName.substring( startIndex, endIndex + 1 );
                        StringBuilder sb = new StringBuilder( results );
                        System.out.println( sb.reverse() );
                    }
                    break;
                case "Cut":
                    String substring = tokens[1];
                    if (userName.contains( substring )) {
                        userName = userName.replace( substring, "" );
                        System.out.println( userName );
                    } else {
                        System.out.printf( "The word %s doesn't contain %s.%n", userName, substring );
                    }
                    break;
                case "Replace":
                    userName = userName.replaceAll( tokens[1], "*" );
                    System.out.println( userName );
                    break;
                case "Check":
                    if (userName.contains( tokens[1] )) {
                        System.out.println( "Valid" );
                    } else {
                        System.out.println( String.format( "Your username must contain %s.", tokens[1] ) );
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}

