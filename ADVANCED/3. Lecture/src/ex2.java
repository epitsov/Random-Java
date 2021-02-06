import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        LinkedHashSet<Integer> first = readSetofNums( n,scanner );
        LinkedHashSet<Integer> second = readSetofNums( m,scanner );
        first.retainAll( second );
        String collect = first.stream().
                map( i -> i + " " )
                .collect( Collectors.joining() );
        System.out.println( collect );
    }

    private static LinkedHashSet<Integer> readSetofNums(int count,Scanner scanner) {
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        while (count-- > 0) {
            nums.add(scanner.nextInt());
        }
        return nums;

    }
}
