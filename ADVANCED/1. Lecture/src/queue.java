import java.util.ArrayDeque;
import java.util.Deque;

public class queue {
    public static void main(String[] args) {
        Deque<Integer> queue=new ArrayDeque<>(  );
        queue.offer( 12 );
        queue.offer( 4 );
        queue.offer( 3123 );
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
