import java.util.Scanner;

public class numberpyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean isbegger = false;
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                if (current > n) {
                    isbegger = true;
                    break;
                }
                System.out.print(current + " ");
                current++;

            }
            if (isbegger) {
                break;
            }
            System.out.println();
        }
    }
}
