import java.util.Scanner;

public class numbers1 {
    public static void main(String[] args) {
        //„+“, „-“, „*“, „/“, „%“
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        if (operator.equals("+") && (N1 + N2) % 2 == 0) {
            System.out.printf("%d + %d = %d - even",N1,N2, N1 + N2);
        } else if (operator.equals("+") && (N1 + N2) % 2 != 0) {
            System.out.printf("%d + %d = %d - odd",N1,N2, N1 + N2);
        } else if (operator.equals("-") && (N1 - N2) % 2 == 0) {
            System.out.printf("%d - %d = %d - even",N1,N2, N1 - N2);
        } else if (operator.equals("-") && (N1 - N2) % 2 != 0) {
            System.out.printf("%d - %d = %d - odd",N1,N2, N1 - N2);
        } else if (operator.equals("*") && (N1 * N2) % 2 == 0) {
            System.out.printf("%d * %d = %d - even",N1,N2, N1 * N2);
        } else if (operator.equals("*") && (N1 * N2) % 2 != 0) {
            System.out.printf("%d * %d = %d - odd",N1,N2, N1 + N2);
        } else if (operator.equals("/")) {
            if (N2 != 0) {
                double x1=N1;
                double x2=N2;
                double result = x1 / x2;
                System.out.printf("%d / %d = %.2f ",N1, N2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", N1);
            }
        } else if (operator.equals("%")) {
            {
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);

                } else {
                    int result = N1 % N2;
                    System.out.printf("%d %% %d = %d ", N1, N2, result);                }
            }

        }

    }}