import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int dailyPlunder = scanner.nextInt();
        double expectedPlunder = scanner.nextDouble();
        double actualPlunder = 0;
        for (int i = 1; i <= days; i++) {
            actualPlunder += dailyPlunder;
            if (i % 3 == 0) {
                actualPlunder += 0.5 * dailyPlunder;
            }
            if (i % 5 == 0) {
                actualPlunder -= actualPlunder * 0.3;
            }
        }


        if (actualPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", actualPlunder);
        } else {

            System.out.printf("Collected only %.2f%% of the plunder.", 100 * (actualPlunder / expectedPlunder));
        }
    }


}
