import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Map<String, Map<String, Double>> stores = new TreeMap<>();
        String input = scanner.nextLine();
        while (!input.equals( "Revision" )) {
            String[] tokens = input.split( ", " );
            if (!stores.containsKey( tokens[0] )) {
                stores.put( tokens[0], new LinkedHashMap<>() );
            }
            stores.get( tokens[0] ).put( tokens[1], Double.parseDouble( tokens[2] ));
            input=scanner.nextLine();
        }
        stores.entrySet().stream()
                .forEach(x->{
                    System.out.println(x.getKey()+"->");
                    x.getValue().entrySet().stream()
                            .forEach( s->
                                    System.out.println(String.format( "Product: %s, Price: %.1f" ,s.getKey(),s.getValue()) ));
                }  );
    }}
