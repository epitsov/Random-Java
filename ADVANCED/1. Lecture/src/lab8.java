import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String input = scanner.nextLine();
        Queue<String> queue = new ArrayDeque<>();
        while (!"home".equals( input )) {
            if ("forward".equals( input )) {
                System.out.println(queue.poll());
            } else if ("back".equals( input )) {
                System.out.println(queue.poll());
            } else {
                queue.offer( input );
            }


        }

    }
}
