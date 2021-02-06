import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	String path="C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream fis=new FileInputStream( path );
        int oneBye=fis.read();
        while (oneBye!=-1)
        {
            System.out.print(Integer.toBinaryString( oneBye )+" ");
            oneBye=fis.read();
        }
    }
}
