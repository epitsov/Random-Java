import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[x];
        int sum=0;
        for (int i = 0; i < x; i++) {
            numbers[i] = scanner.nextInt();
            sum+=numbers[i];
        }
        for (int num:numbers)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
