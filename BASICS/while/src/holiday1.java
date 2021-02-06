import java.util.Scanner;

public class holiday1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyforholiday = Double.parseDouble(scanner.nextLine());
        double moneysaved = Double.parseDouble(scanner.nextLine());
        int dayscounter = 0;
        int spendingcounter = 0;
        while (moneysaved < moneyforholiday && spendingcounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble((scanner.nextLine()));
            dayscounter++;
            if (command.equals("save")) {
                moneysaved += money;
                spendingcounter = 0;
            } else if (command.equals("spend")) {
                moneysaved -= money;
                spendingcounter += 1;
                if (moneysaved < 0) {
                    moneysaved = 0;
                }
            }
        }
        if (spendingcounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(dayscounter);
        }
        if (moneysaved >= moneyforholiday) {
            System.out.printf("You saved the money for %d days.", dayscounter);
        }

    }
}