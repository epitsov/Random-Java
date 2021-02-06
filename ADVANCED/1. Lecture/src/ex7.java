import java.util.Scanner;

public class ex7 {
    private static long[] memory;
    private static long counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        memory = new long[n + 1];
        //fibonacci(n)=fibonnacci(n-1)+fibonacci(n-2);
        long result = fibonacci( n );
        System.out.println( result );
        System.out.println(counter);
    }

    private static long fibonacci(int n) {
        counter++;
        if (n <= 1) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        return memory[n] = fibonacci( n - 2 ) + fibonacci( n - 1 );
    }
}
