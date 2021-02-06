import java.util.*;
import java.util.stream.Collectors;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = Integer.parseInt( scanner.nextLine() );
        Map<String, List<Double>> students = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split( " " );
            String name = input[0];
            Double grade = Double.parseDouble( input[1] );
            if (!students.containsKey( name )) {
                students.put( name, new LinkedList<>() );
                students.get( name ).add( grade );
            }
            else
            {students.get( name ).add( grade );}


        }
       students.entrySet().stream().forEach( k->{
           double avg=k.getValue().stream().mapToDouble( Double::doubleValue ).sum()/k.getValue().size();
           System.out.print(String.format("%s -> ",k.getKey()));
           k.getValue()
                   .stream().forEach( s -> System.out.printf(( "%.2f "),s) );
           System.out.print(String.format( "(avg: %.2f)",avg ));
           System.out.println();
       } );
    }
}
