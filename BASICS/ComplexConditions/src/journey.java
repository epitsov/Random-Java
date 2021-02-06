import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        if (season.equals("summer")) {
            if (budget <= 100) {
                System.out.println("Somewhere in Bulgaria");
                System.out.println();
                System.out.printf("Camp - %.2f", budget * 0.3);
            } else if (budget <= 1000) {
                System.out.println("Somewhere in Balkans");
                System.out.println();
                System.out.printf("Camp - %.2f", budget * 0.4);
            } else {
                System.out.println("Somewhere in Europe ");
                System.out.println();
                System.out.printf("Hotel - %.2f", budget * 0.9);
            }
        } else if (season.equals("winter")) {
            if (budget <= 100) {
                System.out.println("Somewhere in Bulgaria");
                System.out.println();
                System.out.printf("Hotel - %.2f", budget * 0.7);
            } else if (budget <= 1000) {
                System.out.println("Somewhere in Balkans");
                System.out.println();
                System.out.printf("Hotel - %.2f", budget * 0.8);
            }
        } else {
            System.out.println("Somewhere in Europe");
            System.out.println();
            System.out.printf("Hotel - %.2f", budget * 0.9);
        }
    }
}




