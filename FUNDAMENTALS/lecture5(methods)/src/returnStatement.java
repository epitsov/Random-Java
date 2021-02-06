import java.util.Scanner;

public class returnStatement {
    static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    static int printAbs(int x) {
        if (x >= 0) {
            return x;
        }
            return -x;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += printAbs(scanner.nextInt());
        }
    }
}
