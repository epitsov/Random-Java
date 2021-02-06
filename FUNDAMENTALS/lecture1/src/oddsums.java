import java.util.Scanner;

public class oddsums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = 1;
        int z = 0;
        int sum=1;
        System.out.println("1");
        while (z < x-1) {

            y += 2;
            sum += y;

            z++;
            System.out.println(y);;
        }
        System.out.printf("Sum: %d",sum);
    }
}
