import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String string = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals( "Done" )) {
            String[] commandParts = command.split( " " );
            String commandType = commandParts[0];
            switch (commandType) {
                case "Change":
                    string = string.replace( commandParts[1], commandParts[2] );
                    System.out.println( string );
                    break;
                case "Includes":
                    if (string.contains( commandParts[1] )) {
                        System.out.println( "True" );
                    } else {
                        System.out.println( "False" );
                    }
                    break;
                case "End":
                    if (string.endsWith( commandParts[1] )) {
                        System.out.println( "True" );
                    } else {
                        System.out.println( "False" );
                    }
                    break;
                case "Uppercase":
                    string = string.toUpperCase();
                    System.out.println( string );
                    break;
                case "FindIndex":
                    System.out.println( string.indexOf( commandParts[1] ) );
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt( commandParts[1] );
                    int lenght = Integer.parseInt( commandParts[2] );
                    int endindex = startIndex + lenght;
                    string = string.substring(startIndex, endindex );
                    System.out.println(string);
                    break;


            }

            command = scanner.nextLine();
        }
    }
}
