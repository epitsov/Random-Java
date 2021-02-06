
import java.util.Scanner;

public class ex10 {
    static boolean devisable(int x) {
        int sum = 0;
        while (x != 0) {
            int number = 0;
            number = x % 10;
            sum += number;


            x /= 10;
        }
        if (sum % 8 == 0&&sum>0) {
            return true;
        }
        return false;
    }


    static boolean odd(int x) {
        while (x != 0) {
            int number = 0;
            number = x % 10;
            if (number % 2 != 0) {
                return true;
            }

            x /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 1; i < input; i++) {
            if (odd(i) ==true&&devisable(i)==true)
            {
                System.out.println(i);
            }
        }
    }
}
