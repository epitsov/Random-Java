import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = Integer.parseInt( scanner.nextLine() );
        TreeMap<String, Double[]> graduationList = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] scoresString = scanner.nextLine().split( " " );
            Double[] scores = new Double[scoresString.length];
            for (int j = 0; j < scoresString.length; j++) {
                scores[j] = Double.parseDouble( scoresString[j] );

            }
            graduationList.put( name, scores );
        }//Arrays.stream( new double[]{Arrays.stream( s.getValue() ).mapToDouble( Double::doubleValue ).sum()} ) )
        int sum=0;
        graduationList.entrySet().stream()
                .forEach( s-> {
                    double sum1 = Arrays.stream( s.getValue() ).mapToDouble( Double::doubleValue ).sum();
                    System.out.println(String.format("%s is graduated with %.3f", s.getKey(),sum1/s.getValue().length));

                });

    }
}
