import java.util.*;

public class sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 52, 12, -1));
        int[] numArr = new int[]{23, 14, 32};
        Collections.sort(numbers);
        Collections.reverse(numbers);
        Arrays.sort(numArr);
        for (Integer x : numbers) {
            System.out.print(x + " ");
        }
    }
}