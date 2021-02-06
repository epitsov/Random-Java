import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        char y;
        for (int i = 0; i < x; i++) {
            y = scanner.next().charAt(0);
            sum += y;

        }
        System.out.printf("The sum equals: %d",sum);
    }
}
