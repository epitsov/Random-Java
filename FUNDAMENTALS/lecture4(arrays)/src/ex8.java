import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumLooked=scanner.nextInt();
        String nums[] = input.split(" ");
        String biggestArray[] = new String[nums.length];
        int[] numbers = new int[nums.length];
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                sum+=numbers[i]+numbers[j];
                if (sum==sumLooked)
                {
                    System.out.println(numbers[i]+" "+numbers[j]);
                }
                sum=0;
            }
        }
    }
}