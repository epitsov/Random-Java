import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        HashMap<String, Integer> results = new LinkedHashMap<>();
        ArrayList<String> racers = new ArrayList<>(Arrays.asList(data));
        Pattern letterPattern = Pattern.compile("[a-z]|[A-Z]");
        Pattern digitPattern = Pattern.compile("[0-9]");
        String input = scanner.nextLine();
        while (!"end of race".equals(input)) {
            StringBuilder name = new StringBuilder();
            Matcher nameMatcher = letterPattern.matcher(input);
            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }
            if (racers.contains(name.toString())) {
                results.putIfAbsent(name.toString(), 0);
                int newKm = 0;
                int oldKm = results.get(name.toString());
                Matcher digitMathcer = digitPattern.matcher(input);
                while (digitMathcer.find()) {
                    newKm += Integer.parseInt(digitMathcer.group());
                }
                results.put(name.toString(), oldKm + newKm);
            }
            input = scanner.nextLine();
        }
        int[] number = {1};
        results.entrySet().stream()
                .sorted((r1, r2) ->
                        r2.getValue().compareTo(r1.getValue()))
                .limit(3)
                .forEach(r -> {
                    switch (number[0]) {
                        case 1:
                            System.out.println(String.format("1st place: %s", r.getKey()));
                            break;
                        case 2:
                            System.out.println(String.format("2nd place: %s", r.getKey()));
                            break;
                        case 3:
                            System.out.println(String.format("3rd place: %s", r.getKey()));
                            break;
                    }
                    number[0]++;
                });
    }
}
