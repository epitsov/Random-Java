import java.util.Scanner;

public class ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        if (x >= 0 && x <= 3) {
            System.out.println("baby");
        }
        else if (x >= 3 && x <= 13) {
            System.out.println("child");
        }
        else if (x >= 14 && x <= 19) {
            System.out.println("teenager");
        }
        else if (x >= 20 && x <= 65) {
            System.out.println("adult");
        }
        else if (x >= 66) {
            System.out.println("elder");
        }
    }
}
