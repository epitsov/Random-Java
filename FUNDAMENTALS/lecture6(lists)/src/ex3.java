import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<String> party = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input[2].equals("going!")) {
                String name = input[0];
                if (party.contains(name)) {
                    System.out.println(String.format("%s is already in the list!", name));
                } else {
                    party.add(name);
                }
            }
            if (input[2].equals("not")) {
                boolean onthelist = false;
                for (int j = 0; j < party.size(); j++) {
                    if (input[0].equals(party.get(j))) {
                        party.remove(input[0]);
                        onthelist = true;
                        break;
                    }
                }
                if (!onthelist) {
                    System.out.printf("%s is not in the list!%n", input[0]);

                }
            }
        }
        for (int i = 0; i < party.size(); i++) {
            System.out.println(party.get(i));
        }

    }
}

