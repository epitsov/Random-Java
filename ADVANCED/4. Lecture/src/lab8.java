import java.io.File;
import java.util.ArrayDeque;

public class lab8 {
    public static void main(String[] args) {
        String path = "C:\\Users\\epits\\Desktop\\programing\\java\\ADVANCED\\4. Lecture\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        File dir = new File( path );
        //    ArrayDeque<File> queue = new ArrayDeque<>();
        //    queue.push( dir );
        //    while (!queue.isEmpty()) {
        //        File currentDir = queue.pop();
        //        System.out.println( currentDir.getName() );
        //        File[] files = currentDir.listFiles();
        //        for (File file : files) {
        //            if (file.isDirectory()) {
        //                queue.push( file );
        //            } else {
        //                //  System.out.println( file.getName());
        //            }
        //        }
        //    }
        traverseDir( dir, 1 );

    }

    public static void traverseDir(File dir, int level) {
        String format = "";
        for (int i = 0; i < level; i++) {
            format+="=";

        }
        System.out.println( format+">"+dir.getName() );
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                traverseDir( file, level + 1 );
            } else {
                System.out.println( file.getName() );
            }

        }

    }
}
