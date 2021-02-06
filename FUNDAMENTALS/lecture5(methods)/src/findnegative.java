import java.util.Scanner;

public class findnegative {
    static int find1stNeg(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current < 0) {
                return current;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {13, -42, 68, 113};
        int firstNeg = find1stNeg(numbers);
        System.out.println(firstNeg);
    }
}
