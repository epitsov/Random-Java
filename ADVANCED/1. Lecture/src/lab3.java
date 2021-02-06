import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int inut = Integer.parseInt( scanner.nextLine() );
        if(inut==0)
        {
            System.out.println(0);
        }
        Deque<Integer> stack = new ArrayDeque<>();
        while (inut > 0) {
            stack.push( inut % 2 );
            inut /= 2;
        }
        stack.forEach( x -> System.out.print( x ) );
    }
}
