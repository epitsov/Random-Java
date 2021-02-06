import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int banana = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double profit = puzzles * 2.6 + dolls * 3 + bears * 4.1 + banana * 8.2 +
                trucks * 2;
        int toys = puzzles + dolls + bears + banana + trucks;
        if (toys >= 50) {
            profit = profit * 0.75;
        }
        profit = profit * 0.9;
        if (profit >= price) {
            System.out.printf("Yes! %.2f lv left.", profit - price);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", price - profit);
        }
    }
}