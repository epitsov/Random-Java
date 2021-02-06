import java.util.*;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        LinkedHashSet<Integer> firstDeck = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondDeck = new LinkedHashSet<>();
        String[] input = scanner.nextLine().split( "\\s+" );
        String[] input1 = scanner.nextLine().split( "\\s+" );
        for (int i = 0; i < 20; i++) {

        }
        for (int i = 0; i < 20; i++) {
            secondDeck.add( Integer.parseInt( input1[i] ) );
        }
        System.out.println();
    }
}
