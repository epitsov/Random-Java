import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class random {
    public static List<String> noX(List<String> strings) {
        return strings.stream()
                .filter( x->x.length( 'z' ) )
                .map(x->x.replace( "x","" ))
                .collect( Collectors.toList() );
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList( "ax", "bb", "cx" );
        noX( list );
        System.out.println(noX(list ));

    }
}
