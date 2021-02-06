import java.util.Scanner;

public class smarlilz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double pricewash = Double.parseDouble(scanner.nextLine());
        int pricetoy = Integer.parseInt(scanner.nextLine());
        int moneycount = 0;
        int toyscount = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneycount++;
            } else {
                toyscount++;
            }
        }
        double savedmoney = toyscount * pricetoy;
        for (int i = 1; i <= moneycount; i++) {
            savedmoney += (10 * i);
        }
        savedmoney -= moneycount;
        if (savedmoney >= pricewash) {
            System.out.printf("Yes! %.2f", savedmoney - pricewash);
        } else {
            System.out.printf("No! %.2f", pricewash - savedmoney);
        }
    }
}
