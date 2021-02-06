import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        ArrayDeque<String> stack = new ArrayDeque<>();
        Arrays.stream( scanner.nextLine().split( " " ) )
                .forEach( stack::push );
        while (!stack.isEmpty()) {
            System.out.print( stack.pop() + " " );
            }
        }


}
