import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class lambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(1, -2, -4, 5, 6);
        List<Integer> positiveNums = filter(numbers, number -> number > 0);
        List<Integer> negativeNums = filter(numbers, number -> number < 0);
        List<Integer> evenNums = filter(numbers, number -> number % 2==0);

        for (Integer positiveNum : positiveNums) {
            System.out.print(positiveNum + " ");
        }

    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            boolean isvalid = predicate.test(number);
            if (isvalid) {
                result.add(number);
            }
        }
        return result;
    }
}
