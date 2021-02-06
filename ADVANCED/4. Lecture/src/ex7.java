import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String path2 = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        Scanner scanner = new Scanner( new File( path ) );
        PrintWriter writer = new PrintWriter( "mergeOutput.txt" );
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            writer.append( s ).append( System.lineSeparator() );

        }
        scanner=new Scanner( new File(path2) );
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            writer.append( s ).append( System.lineSeparator() );

        }
        writer.close();
    }
}
