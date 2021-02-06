import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String nums[] = input.split(" ");
        int[] numbers = new int[nums.length];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        String output="no";
        for (int i = 0; i < numbers.length; i++) {
            int leftsum = 0;
            int rightsum = 0;
            for (int l = 0; l < i; l++) {
                leftsum += numbers[l];
            }
            for (int r = i + 1; r < numbers.length; r++) {
                rightsum += numbers[r];
            }
            if (leftsum == rightsum) {
                output = i + "";
                break;
            }
        }
        System.out.println(output);
    }

}

