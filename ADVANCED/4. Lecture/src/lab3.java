import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) throws IOException {
        int space = ' ';
        int newLine = '\n';
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "output.txt";
        FileInputStream fis = new FileInputStream( path );
        FileOutputStream fos = new FileOutputStream( output );
        int oneByte = fis.read();
        while (oneByte != -1) {
            String stringNumber = String.valueOf( oneByte );

            if (oneByte == space || oneByte == newLine) {
                fos.write( oneByte );
            } else {
                for (int i = 0; i < stringNumber.length(); i++) {
                    fos.write( stringNumber.charAt( i ) );
                }
            }

            oneByte = fis.read();
        }
    }
}
