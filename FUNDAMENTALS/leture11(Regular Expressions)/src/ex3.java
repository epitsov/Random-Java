import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%<(?<item>[A-Z][a-z]+)>([a-z]+)?\\|(?<quantity>[0-9]+)\\|([a-z]+)?(?<price>[0-9]+.?[0-9]?)\\$");
        Map<List<String>, Double> output = new LinkedHashMap<>();
        double totalIncome = 0.0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String item = matcher.group("item");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalprice = quantity * price;
                totalIncome += totalprice;
                List<String> nameAndItem = new ArrayList<>();
                nameAndItem.add(name);
                nameAndItem.add(item);
                output.put(nameAndItem, totalprice);


            }

            input = scanner.nextLine();
        }

        output.entrySet().stream()

                .forEach(a -> System.out.println( String.format("%s: %s - %.2f",a.getKey().get(0) ,a.getKey().get(1) ,a.getValue())));
        System.out.println(String.format("Total income: %.2f",totalIncome));
    }
}
