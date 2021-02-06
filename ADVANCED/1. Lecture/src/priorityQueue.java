import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(  );
        priorityQueue.offer( 14 );
        priorityQueue.offer( 34 );
        priorityQueue.offer( Integer.MAX_VALUE );
        priorityQueue.offer( Integer.MIN_VALUE );
        System.out.println(priorityQueue.poll());
    }
}
