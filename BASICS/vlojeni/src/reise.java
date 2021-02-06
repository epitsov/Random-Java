import java.util.Scanner;

public class reise {
    public static void main(String[] args) {
        boolean isfulfilled = true;
        double income = 0.0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        int dailyquote = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= dailyquote; i++) {
            String fishname = scanner.nextLine();
            if (fishname.equals("Stop")) {
                isfulfilled=false;
                break;
            }
            counter++;
            double kg = Double.parseDouble(scanner.nextLine());
            int sum = 0;

            for (int j = 0; j <fishname.length(); j++) {
                int value = fishname.charAt(j);
                sum += value;
            }

            double price = sum / kg;
            if (counter % 3 == 0) {
                income += price;
            } else {
                income -= price;
            }
        }
        if (isfulfilled) {
            System.out.println("Lyubo fulfilled the quota!");
        }
        if (income > 0) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", counter, income);
        } else {
            System.out.printf("Lyubo lost %.2f leva today.", Math.abs(income));
        }
    }
}