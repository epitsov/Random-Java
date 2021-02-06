import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = Integer.parseInt( scanner.nextLine() );
        Map<String, Map<String, int[]>> dragons = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split( " " );
            String type = tokens[0];
            String name = tokens[1];
            int[] data = new int[3];
            data[0] = tokens[2].equals( "null" ) ? 45 : Integer.parseInt( tokens[2] );
            data[1] = tokens[3].equals( "null" ) ? 250 : Integer.parseInt( tokens[3] );
            data[2] = tokens[4].equals( "null" ) ? 10 : Integer.parseInt( tokens[4] );
            if (!dragons.containsKey( type )) {
                dragons.put( type, new TreeMap<>() );
            }
            dragons.get( type ).putIfAbsent( name, data );
            dragons.get( type ).put( name, data );

        }
        dragons.forEach( (k, v) -> {
            double[] avg = new double[3];
            v.forEach( (key, value) -> {
                avg[0] += value[0];
                avg[1] += value[1];
                avg[2] += value[2];

            } );
            avg[0] /= v.size();
            avg[1] /= v.size();
            avg[2] /= v.size();
            System.out.println( String.format( "%s::(%.2f/%.2f/%.2f)", k, avg[0], avg[1], avg[2] ) );
            v.forEach( (key, value) -> {
                System.out.println( String.format( "-%s -> damage: %d, health: %d, armor: %d",
                        key, value[0], value[1], value[2] ) );
            } );

        } );
    }
}
