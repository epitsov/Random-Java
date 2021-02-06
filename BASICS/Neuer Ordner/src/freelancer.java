import java.util.Scanner;

public class freelancer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double carprice = Double.parseDouble(scanner.nextLine());
        double bills = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        int years = 0;
        double expenses = 0.0;
        double x = 0.0;
        while (carprice > 0) {
            double income = Double.parseDouble(scanner.nextLine());
            counter++;

            expenses = income - bills;
            x += expenses;
            if (x <= 0) {

                break;
            }
            carprice -= expenses;
            if (counter >= 12) {
                years++;
                counter = 0;
            }
        }
        if (x <= 0) {
            System.out.println("It seems you have bankrupted...");
            System.out.printf("You have worked %d years %d months", years, counter);
        } else {
            System.out.println("You did it!");
            System.out.printf("It took you %d years %d months", years, counter);
        }
    }
}
