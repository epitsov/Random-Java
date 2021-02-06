import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        if (numbers.size() % 2 == 0) {
            while (numbers.size() > 0) {
                int sum1 = numbers.get(0) + numbers.get(numbers.size() - 1);
                sum.add(sum1);
                numbers.remove(0);
                numbers.remove(numbers.size() - 1);

            }
        } else {
            int middle = numbers.get(numbers.size() / 2);
            numbers.remove(numbers.size() / 2);
            while (numbers.size() > 0) {
                int sum1 = numbers.get(0) + numbers.get(numbers.size() - 1);
                sum.add(sum1);
                numbers.remove(0);
                numbers.remove(numbers.size() - 1);
            }
            sum.add(middle);
        }
        for (int num : sum) {
            System.out.print(num + " ");
        }
    }}

