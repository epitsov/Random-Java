import java.io.File;

public class ex8 {
    public static void main(String[] args) {
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File file = new File( path );
        long size = 0;
        for (File listFile : file.listFiles()) {
            size += listFile.length();
        }
        System.out.println(size);
    }
}
