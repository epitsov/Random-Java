import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String charNames = readCharNames(scanner);
        int tossesToRemoveOn = readN(scanner);
        String[] splitChildren = charNames.split( " " );
        Deque<String> queue = new ArrayDeque<>( Arrays.asList( splitChildren ) );
        int currentRound = 1;
        while (queue.size() > 1) {
            String currentChild = queue.poll();
            if (currentRound % tossesToRemoveOn != 0) {
                queue.offer( currentChild );
            }
            else
            {
                System.out.println("Removed "+currentChild);
            }

            currentRound++;
        }
        System.out.println( String.format( "Last is %s", queue.poll() ) );
    }

    private static int readN(Scanner scanner) {

        return scanner.nextInt();
    }

    private static String readCharNames(Scanner scanner) {
        return scanner.nextLine();
    }
}
