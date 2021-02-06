import java.util.Scanner;

public class evenmalodds {
    static int getevenSum(int x) {
        int number = 0;
        int evensum = 0;
        while (x != 0) {
            number = x % 10;
            if (number % 2 == 0) {
                evensum += number;
            }
            x /= 10;
        }
        return evensum;
    }

    static int getoddSum(int x) {
        int number = 0;
        int oddnsum = 0;

        while (x != 0) {
            number = x % 10;
            if (number % 2 != 0) {
                oddnsum += number;
            }
            x /= 10;
        }
        return oddnsum;
    }

    static int multoply(int x) {
        int y = getevenSum(x) * getoddSum(x);
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int z = multoply(x);
        System.out.println(z);
    }
}
