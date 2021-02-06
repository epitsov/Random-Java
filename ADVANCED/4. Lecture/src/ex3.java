import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ex3 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        FileOutputStream outputStream=new FileOutputStream( "output.txt" );
        BufferedWriter writer=new BufferedWriter( new OutputStreamWriter( outputStream ) );
        Files.readAllLines( Path.of( path ))
                .stream()
                .forEach( str-> {
                    try {
                        writer.write( str.toUpperCase() );
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } );
        writer.close();
    }
}
