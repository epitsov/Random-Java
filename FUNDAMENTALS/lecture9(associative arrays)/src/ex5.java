import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> cars = new LinkedHashMap<>();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String name = input[1];

            if (command.equals("register")) {
                if (!cars.containsKey(name)) {
                    String number = input[2];
                    cars.put(name, number);
                    System.out.printf("%s registered %s successfully%n",name,number);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", cars.get(name));
                }
            } else {
                {
                    if (!cars.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        cars.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }

                }
            }
        }
        cars.entrySet().stream().forEach(entry-> System.out.printf("%s => %s%n",entry.getKey(),entry.getValue()));
    }
}