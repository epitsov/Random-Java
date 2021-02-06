import java.util.Scanner;

public class amount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount=0;
        for (int i = 0; i < 3; i++) {
            int digit = scanner.nextInt();
        amount*=10;
        amount+=digit;}

        System.out.println(amount);
    }
}
