import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int numbersToPush = scanner.nextInt();
        int numbersToPop = scanner.nextInt();
        int lookUpNumber = scanner.nextInt();
        scanner.nextLine();
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        String[] input = scanner.nextLine().split( "\\s" );
        for (int i = 0; i < numbersToPush; i++) {
            numbers.push( Integer.parseInt( input[i] ) );
        }
        for (int i = 0; i < numbersToPop; i++) {
            numbers.pop();
        }
        if (numbers.contains( lookUpNumber )) {
            System.out.println( "true" );
        } else {
            if(!numbers.isEmpty()){
            System.out.println( Collections.max( numbers ) );}
            else
            {
                System.out.println(0);
            }
        }

    }
}
