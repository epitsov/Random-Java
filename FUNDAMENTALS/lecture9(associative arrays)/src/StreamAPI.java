import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[]{1, 2, 3, -4, 5};
        System.out.println(Arrays.stream(numbers).average().orElse(0));
        System.out.println(Arrays.stream(numbers).filter(x -> x > 0).min().orElse(0));
        List<Double> numbers1 = Arrays.asList(1., 2., 3., -4., 5.);
        Stream<Double> stream = numbers1.stream();

        List<String> words = Arrays.asList("rOyal", "CamelCase", "Pascalcase");
        List<String> streamWords = words.stream()
                .filter(x -> x.length() < 7)
                .map(x -> x.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(String.join("", streamWords));

        words.stream()
                .filter(x -> x.length() < 7)
                .map(x -> x.toLowerCase())
                .forEach(x -> System.out.print(x + " "));
        double minPositive = stream.filter(x -> x > 0).min((a, b) -> a.compareTo(b)).orElse(0.);
        double minPositive1 = stream.filter(x -> x > 0)
                .mapToDouble(Double::doubleValue)
                .min()
                .orElse(0.);
        double minPositiveMultiplied = stream.map(x -> x * 2)
                .filter(x -> x > 0)
                .mapToDouble(Double::doubleValue)
                .min()
                .orElse(0.);

        IntStream numbersStream = Arrays.stream(numbers);
        System.out.println(numbersStream.sum());
        System.out.println(numbersStream.average());
        OptionalInt min = numbersStream.min();
        if (min.isPresent()) {
            System.out.println(min.getAsInt());
        } else {
            System.out.println("no min value");
        }
        //List<Integer> numbersList=Arrays.asList(1,-2,3,-4,5,null);
        //Stream<Integer> stream = numbersList.stream();
        //IntStream intStream = stream.mapToInt(x -> x);
        //IntStream intStream1 = stream.mapToInt(Integer::intValue);
        // intStream2 = stream.mapToInt(x -> x!=null?x.intValue():0);
    }
}
