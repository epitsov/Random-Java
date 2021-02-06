import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String charNames = readCharNames( scanner );
        int tossesToRemoveOn = readN( scanner );
        String[] splitChildren = charNames.split( " " );
        int counter = 1;
        Deque<String> queue = new ArrayDeque<>( Arrays.asList( splitChildren ) );
        while (queue.size() > 1) {
            for (int i = 0; i <queue.size() ; i++) {
                queue.offer( queue.poll() );
            }
            if (!primeChecker( counter )) {
                System.out.println( "Removed " + queue.poll() );
            } else {
                System.out.println( "Prime" + queue.peek() );

            }
            counter++;
        }
        System.out.println( String.format( "Last is %s", queue.poll() ) );
    }

    private static boolean primeChecker(int counter) {

            for (int i = 2; i < counter; i++) {
                if (counter % i == 0) {
                    return true;
                }

            }

        return false;

    }

    private static int readN(Scanner scanner) {

        return scanner.nextInt();
    }

    private static String readCharNames(Scanner scanner) {
        return scanner.nextLine();
    }
}