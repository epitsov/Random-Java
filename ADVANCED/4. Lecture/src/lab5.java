import java.io.*;

public class lab5 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "output.txt";

        try (BufferedReader br = new BufferedReader( new FileReader( path ) );
             PrintWriter pr = new PrintWriter( new FileOutputStream( output ) )
        ) {
            String line = br.readLine();
            int counter = 1;
            while (line != null) {
                if (counter % 3 == 0) {
                    pr.println( line );
                }
                counter++;
                line = br.readLine();
            }

        }
    }
}
