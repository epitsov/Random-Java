import java.io.*;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "output.txt";
        FileInputStream fis = new FileInputStream( path );
        FileOutputStream fos = new FileOutputStream( output );
        Scanner scanner = new Scanner( fis );
        PrintWriter printwriter = new PrintWriter( fos );
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                printwriter.println( scanner.nextInt() );
                printwriter.flush();
            } else {
                scanner.next();
            }
        }
        printwriter.close();
        scanner.close();
        //int oneByte = fis.read();
    }
}
