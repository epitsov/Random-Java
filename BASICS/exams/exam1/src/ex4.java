import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int honorar = Integer.parseInt(scanner.nextLine());
        String z = "";
        int guests = 0;
        int couvert = 0;
        while (!z.equals("The restaurant is full")) {
            z = scanner.nextLine();
            if (z.equals("The restaurant is full")) {
                break;
            }
            int z2 = Integer.parseInt("" + z);
            guests += z2;
            if (z2 < 5) {
                couvert = couvert + z2 * 100;
            } else {
                couvert = couvert + z2 * 70;
            }

        }

        int moneyleft = couvert - honorar;
        if (moneyleft >= 0) {
            System.out.printf("You have %d guests and %d leva left.", guests, moneyleft);
        } else {
            System.out.printf("You have %d guests and %d leva income, but no singer.", guests, couvert);
        }
    }
}

