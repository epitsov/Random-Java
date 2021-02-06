import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String nums[] = input.split(" ");
        String biggestArray[]=new String[nums.length];
        int[] numbers = new int[nums.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        int number = 0;
        int maxCounter = 0;
        int counter = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                break;
            }
            if (numbers[i] == numbers[i + 1]) {
                counter++;
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                number = numbers[i];
            } if(numbers[i] == numbers[i + 1])
            {continue;}
            else {
                counter = 1;
            }
        }
        for (int i = 0; i <maxCounter ; i++) {
        System.out.print(number+" ");}
    }
}