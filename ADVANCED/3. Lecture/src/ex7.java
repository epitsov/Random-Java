import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = Integer.parseInt( scanner.nextLine() );
        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String tokens[] = input.split( " " );
            if (!continents.containsKey( tokens[0] )) {
                continents.put( tokens[0], new LinkedHashMap<>() );
                continents.get( tokens[0] ).put( tokens[1], new ArrayList<>() );
                continents.get( tokens[0] ).get( tokens[1] ).add( tokens[2] );
            } else {
                if (continents.get( tokens[0] ).containsKey( tokens[1] )) {
                    continents.get( tokens[0] ).get( tokens[1] ).add( tokens[2] );
                } else {
                    continents.get( tokens[0] ).put( tokens[1], new ArrayList<>() );
                    continents.get( tokens[0] ).get( tokens[1] ).add( tokens[2] );
                }
            }

        }
        continents.entrySet().stream().forEach( x ->
                {
                    System.out.println( x.getKey() + ":" );

                    x.getValue().entrySet().stream()
                            .forEach( s -> System.out.println( String.format( " %s -> %s", s.getKey(),s.getValue().stream().
                                    map( Objects::toString ).collect(Collectors.joining(", ")  ) ) ));


                }
        );
    }
}
