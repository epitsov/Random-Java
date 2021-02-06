import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;
        while (input > 0) {
            sum += input % 10;
            input /= 10;
        }
        System.out.println(sum);
    }
}
