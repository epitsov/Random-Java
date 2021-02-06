import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class printImg {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\epits\\Desktop\\uni\1.PNG";
        byte[] bytes = Files.readAllBytes( Path.of( path ) );
        String ecoded = Base64.getEncoder().encodeToString( bytes );
        new PrintWriter( "img.txt").write( ecoded );
    }
}
