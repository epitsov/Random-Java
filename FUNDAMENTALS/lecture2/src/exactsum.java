import java.math.BigDecimal;
import java.util.Scanner;

public class exactsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < x; i++) {
            BigDecimal z = new BigDecimal(scanner.nextLine());
            sum = sum.add(z);
        }
        System.out.println(sum);
    }
}
