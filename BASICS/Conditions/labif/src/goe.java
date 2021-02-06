import java.util.Scanner;

public class goe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        if (s > 150) {
            double price = x * 0.1 + (s * y) * 0.9;
            if (price > x) {
                double mee = price - x;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", mee);
            } else {
                double c = x - price;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", c);
            }}

        else{
               double  price = x * 0.1 + s * y;

                if (price > x) {
                    double mee = price - x;
                    System.out.println("Not enough money!");
                    System.out.printf("Wingard needs %.2f leva more.", mee);
                } else {
                    double c = x - price;
                    System.out.println("Action!");
                    System.out.printf("Wingard starts filming with %.2f leva left.", c);

                }
            }
        }
    }