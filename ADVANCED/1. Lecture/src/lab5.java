import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String input = scanner.nextLine();
        Queue<String> queue = new ArrayDeque<>();

        while (!input.equals( "print" )) {
            if ("cancel".equals( input )) {
                if(queue.isEmpty())
                {
                    System.out.println("Printer is on standby");
                }
                else
                {
                System.out.println( String.format( "Canceled %s", queue.poll() ) );}
            } else {
                queue.offer( input );
            }


            input = scanner.nextLine();
        }
        queue.forEach( x -> System.out.println( x ) );
    }
}
