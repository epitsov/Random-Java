import java.util.Scanner;

public class random {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int oppositeIndex = numbers.length - 1 - i;
            int oldnumbersI = numbers[i];
            numbers[i] = numbers[oppositeIndex];
            numbers[oppositeIndex] = oldnumbersI;

        }
        for(int i=0;i<numbers.length;i++)
        {System.out.print(numbers[i]+" ");}
    }
}
