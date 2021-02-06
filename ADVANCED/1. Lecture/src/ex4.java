import java.util.ArrayDeque;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int numbersToOffer = scanner.nextInt();
        int numbersToPoll = scanner.nextInt();
        int lookUpNumber = scanner.nextInt();
        scanner.nextLine();
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        String[] input = scanner.nextLine().split( "\\s" );
        for (int i = 0; i < numbersToOffer; i++) {
            numbers.offer( Integer.parseInt( input[i] ) );
        }
        for (int i = 0; i <numbersToPoll ; i++) {
            numbers.poll();
        }
        if(numbers.contains( lookUpNumber ))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println( numbers.stream()
                    .min( Integer::compareTo )
                    .orElse( 0 ) );
        }
    }
}
