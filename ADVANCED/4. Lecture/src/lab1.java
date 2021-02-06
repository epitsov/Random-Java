import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class lab1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "output.txt";
        FileInputStream fis = new FileInputStream( path );
        FileOutputStream fos = new FileOutputStream( output );
        Set<Character> punctuation = Set.of( ',','!','?','.');
        int oneByte = fis.read();
        while (oneByte != -1) {
            if (!punctuation.contains( (char)oneByte )) {
                fos.write( oneByte );
            }
            oneByte = fis.read();
        }
    }
}
