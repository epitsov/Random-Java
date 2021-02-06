import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 0) {
            {
                while (number % 2 != 0) {
                    System.out.println("Please write an even number.");
                    number = Integer.parseInt(scanner.nextLine());
                }
                System.out.printf("The number is: %d", number);
            }
        } else {
            System.out.printf("The number is: %d", Math.abs(number));
        }
    }
}