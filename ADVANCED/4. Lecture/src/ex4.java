import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static int[] counter = new int[3];

    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        PrintWriter writer=new PrintWriter( "Output.txt" );
        Scanner scanner = new Scanner( new File( path) );
        String table = "aeiouAEIOU";
        String punktuations = "!.,?";
        while (scanner.hasNext()) {
            String line=scanner.nextLine();
            Arrays.stream( line.split( " " ) )
                    .forEach( str -> {
                        for (char symbol : str.toCharArray()) {
                            if (table.contains( String.valueOf( symbol ) )) {
                                counter[0]++;
                            } else if (punktuations.contains( String.valueOf( symbol ) )) {
                                counter[2]++;
                            } else {
                                counter[1]++;
                            }
                        }
                    } );
        }
        writer.printf("Vowels: %d%n",counter[0]  );
        writer.printf( "Consonants: %d%n",counter[1] );
        writer.printf( "Punctuation %d%n",counter[2] );
        writer.close();
    }

}
