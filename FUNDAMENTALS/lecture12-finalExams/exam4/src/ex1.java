import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String word = scanner.nextLine();
        String line = scanner.nextLine();
        while (!"Finish".equals( line )) {
            String[] tokens = line.split( "\\s+" );
            String command = tokens[0];
            switch (command) {
                case "Replace": {
                    String currentChar = tokens[1];
                    String newChar = tokens[2];
                    word = word.replaceAll( currentChar, newChar );
                    System.out.println( word );
                    break;
                }
                case "Cut": {
                    int startInd = Integer.parseInt( tokens[1] );
                    int endInd = Integer.parseInt( tokens[2] );
                    if (startInd >= 0  && endInd < word.length()) {
                       String word1 = word.substring( startInd, endInd );
                       String wordBefore=word.substring( 0,word.indexOf( word1 ) );
                       String wordAfter=word.substring( word.indexOf( word1 )+word1.length()+1);
                        System.out.println(wordBefore+wordAfter);
                        StringBuilder a=new StringBuilder(  );

                    } else {
                        System.out.println( "Invalid indexes!" );
                    }
                    break;
                }
                case "Make": {

                    if (tokens[1].equals( "Upper" )) {
                        word = word.toUpperCase();
                        System.out.println( word );
                    } else {
                        word = word.toLowerCase();
                        System.out.println( word );
                    }
                    break;
                }
                case "Check": {
                    String input = tokens[1];
                    if (word.contains( input )) {
                        System.out.println( String.format( "Message contains %s", input ) );
                    } else {
                        System.out.println( String.format( "Message doesn't contain %s", input ) );
                    }
                    break;
                }
                case "Sum": {
                    int startInd = Integer.parseInt( tokens[1] );
                    int endInd = Integer.parseInt( tokens[2] );
                    int sum=0;
                    if (startInd >= 0  && endInd < word.length()) {
                        for (int i = startInd; i <=endInd ; i++) {
                            sum+=word.charAt( i );
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println( "Invalid indexes!" );
                    }
                    break;
                }
            }

            line = scanner.nextLine();
        }
    }
}
