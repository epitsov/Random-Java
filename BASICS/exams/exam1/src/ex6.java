import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i <= money; i++) {
            String item = scanner.nextLine();
            if (item.equals("Stop")) {
                System.out.println("Money left: " + money);
                break;
            }
            for (int j = 0; j < item.length(); j++) {
                int symbol = item.charAt(j);
                sum += symbol;
            }
            money -= sum;
            if (money < 0) {
                System.out.println("Not enough money!");
                break;
            } else {
                System.out.println("Item successfully purchased!");
            }
            sum = 0;

        }
    }
}
