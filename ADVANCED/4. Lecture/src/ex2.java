import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ex2 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        int sum = 0;
        for (byte value : Files.readAllBytes( Path.of( path ) )) {
            if (value != 10 && value != 13)
            {sum+=value;}
        }
        System.out.println( sum );

    }
}
