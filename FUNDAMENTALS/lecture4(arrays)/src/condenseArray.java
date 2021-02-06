import java.util.Scanner;

public class condenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output[] = input.split(" ");
        int[] numbers = new int[output.length];
        for (int i = 0; i < output.length; i++) {
            numbers[i] = Integer.parseInt(output[i]);
        }
        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;
        }
        System.out.println(numbers[0]);
    }
}
