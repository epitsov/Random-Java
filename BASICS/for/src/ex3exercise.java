import java.util.Scanner;

public class ex3exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double oddsum = 0;
        double oddmin = 1000000000.0;
        double oddmax = -1000000000.0;
        double evensum = 0;
        double evenmin = 1000000000.0;
        double evenmax = -1000000000.0;
        for (int i = 1; i <= n; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evensum += input;
                evenmin = Math.min(evenmin, input);
                evenmax = Math.max(evenmax, input);
            } else {
                oddsum += input;
                oddmin = Math.min(oddmin, input);
                oddmax = Math.max(oddmax, input);
            }

        }
        System.out.printf("OddSum=%.2f,%n", oddsum);
        if (oddmin == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddmin);
        }
        if (oddmax == -1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", oddmax);
        }

        System.out.printf("EvenSum=%.2f,%n", evensum);
        if (evenmin == 1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenmin);
        }
        if (evenmax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f", evenmax);
        }


    }
}

