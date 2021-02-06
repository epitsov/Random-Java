import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double journeycost = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double moneysaved = 0.0;
        for (int i = 1; i <= months; i++) {
            if (i > 1 && i % 2 != 0) {
                moneysaved *= 0.84;
            }
            if (i % 4 == 0) {
                moneysaved *= 1.25;
            }
            moneysaved += journeycost * 0.25;

        }


        if (moneysaved >= journeycost) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", moneysaved - journeycost);
        } else {
            System.out.printf("Sorry. You need %.2flv. more.", journeycost - moneysaved);
        }
    }
}
