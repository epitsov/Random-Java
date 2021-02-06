import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class ex1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        // FileInputStream inputStream = new FileInputStream( path );
        // byte[] bytes = inputStream.readAllBytes();
        //List<String> strings = Files.readAllLines( Path.of( path ) );
//  Files.readAllLines( Path.of( path ) )
//        .stream()
//        .map( str -> str.toCharArray() )
//        .forEach( c -> {
//            int bytes = 0;
//            for (char symbol : c) {
//                bytes += symbol;

//            }
//            System.out.println(bytes);
//        } );
        BufferedReader reader = new BufferedReader( new FileReader( path ));
        String line = reader.readLine();
        while (line!=null) {
            int sum = 0;
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
            System.out.println( sum );
            line = reader.readLine();
        }
    }
}
