import java.util.Scanner;

public class account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double balance=0.0;

        while (n>0) {
            double income= Double.parseDouble(scanner.nextLine());
            if (income<0) {
                System.out.println("Invalid operation!");
            }
            System.out.printf("Increase: %.2f%n",income);
            balance +=income;;
            n--;}
        System.out.printf("Total: %.2f",balance);
    }
}
