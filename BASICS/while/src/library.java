import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        int n = 0;
        int x = Integer.parseInt(scanner.nextLine());
        boolean isfound = false;
        while (n <= x) {
            String newbook = scanner.nextLine();
            if (newbook.equals(book)) {
                System.out.printf("You checked %d books and found it.", n);
                isfound = true;
                break;
            }
            n++;
        }
        if (!isfound) {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.", x);
        }
    }
}
