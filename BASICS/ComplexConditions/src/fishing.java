import java.util.Scanner;

public class fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisher = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        if (season.equals("Spring")) {
            if (fisher <= 6) {
                price = 3000 * 0.9;
            } else if (fisher > 6 && fisher <= 11) {
                price = 3000 * 0.85;
            } else {
                price = 3000 * 0.75;
            }
        } else if (season.equals("Summer") || season.equals("Autum"))
            {
                if (fisher <= 6) {
                    price = 4200 * 0.9;
                } else if (fisher > 6 && fisher <= 11) {
                    price = 4200 * 0.85;
                } else {
                    price = 4200 * 0.75;
                }
            } else{
                if (fisher <= 6) {
                    price = 2600 * 0.9;
                } else if (fisher > 6 && fisher <= 11) {
                    price = 2600 * 0.85;
                } else {
                    price = 2600 * 0.75;
                }
            }
            if (fisher % 2 == 0 && !season.equals("Autum")) {
                price = price * 0.95;
            }
            if(budget>=price)
            {
                System.out.printf("Yes! You have %.2f leva left.",budget-price);

            }
            else{
                System.out.printf("Not enough money! You need %.2f leva.",price-budget);}
            }
        }


