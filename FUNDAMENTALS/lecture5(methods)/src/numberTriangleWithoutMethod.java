import java.util.Scanner;

public class numberTriangleWithoutMethod {
    static void printRowofNum(int to) {
        for (int i = 0; i < to; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            printRowofNum(i);
        }
        for (int i = size-1; i < 1; i--) {
            printRowofNum(i);
        }
    }
}
