import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Map<Double, Integer> map = new LinkedHashMap<>();
        String inputLine = scanner.nextLine();
        String[] split = inputLine.split( "\\s+" );
        for (String s : split) {
            double dbl = Double.parseDouble( s );
            if (map.containsKey( dbl )) {
                map.put( dbl, map.get( dbl ) + 1 );
            } else {
                map.put( dbl, 1 );
            }

        }
        for (Map.Entry<Double, Integer> element : map.entrySet()) {
            System.out.println( String.format( "%.1f -> %d", element.getKey(), element.getValue() ) );
        }
    }
}
