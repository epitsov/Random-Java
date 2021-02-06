import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class namegame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int sum = 0;
        String winner = "";
        int winnerpoints = 0;
        int maxpoints = Integer.MIN_VALUE;
        while (!x.equals("Stop")) {

            for (int i = 0; i <= x.length() - 1; i++) {
                int input = Integer.parseInt(scanner.nextLine());
                char charati = x.charAt(i);
                if (input == charati) {
                    sum = sum + 10;
                } else {
                    sum = sum + 2;
                }
            }
            if (sum >= maxpoints) {
                maxpoints=sum;
                winnerpoints = sum;
                winner = x;
            }

            x = scanner.nextLine();
            sum = 0;
        }
        System.out.printf("The winner is %s with %d points", winner, winnerpoints);
    }
}
