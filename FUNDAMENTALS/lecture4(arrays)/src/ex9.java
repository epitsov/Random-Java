import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lenght = Integer.parseInt(input);
        int maxcount = 0;
        int minindex = 100000;
        int maxsum = 0;
        int sample = 1;
        int bestsample = 0;
        int[] bestarray = new int[lenght];
        while (!input.equals("Clone them!")) {
            int counter = 0;
            int sum = 0;

            input = scanner.nextLine();
            if (input.equals("Clone them!")) {
                break;
            }
            String nums[] = input.split("!+");
            int[] numbers = new int[lenght];
            for (int i = 0; i < lenght; i++) {
                numbers[i] = Integer.parseInt(nums[i]);
                sum += numbers[i];

            }

            for (int i = 0; i < lenght - 1; i++) {
                {
                    if (numbers[i] == numbers[i + 1] && numbers[i] == 1) {
                        counter++;
                    }
//sum > maxsum
                    if (counter > maxcount) {
                        minindex = i;
                        maxcount = counter;
                        bestarray = numbers;
                        maxsum = sum;
                        bestsample = sample;
                        counter = 0;
                    } else if (counter == maxcount) {
                        if (i < minindex) {
                            minindex = i;
                            maxcount = counter;
                            bestarray = numbers;
                            maxsum = sum;
                            bestsample = sample;
                            counter = 0;
                        } else if (i == minindex) {
                            minindex = i;
                            maxcount = counter;
                            bestarray = numbers;
                            maxsum = sum;
                            bestsample = sample;
                            counter = 0;
                        }
                    }
                    else{      minindex = i;
                        maxcount = counter;
                        bestarray = numbers;
                        maxsum = sum;
                        bestsample = sample;
                        counter = 0;}
                }

            }
            sample++;
        }
        System.out.printf("Best DNA sample %d with sum: %d.", bestsample, maxsum);
        System.out.println();
        for (int i = 0; i < lenght; i++) {
            System.out.print(bestarray[i] + " ");

        }
    }
}