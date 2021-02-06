import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //List<String> treasure = new ArrayList<>();
        //String []trasure=scanner.nextLine().split("\\|");
        //List<String> treasure = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\|")));
        String[] parts = scanner.nextLine().split("\\|");
        List<String> treasure = new ArrayList<>(Arrays.asList(parts));
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            List<String>commandParts = Arrays.asList(command.split(" "));
            String type = commandParts.get(0);
            switch (type) {
                case "Loot":
                    List<String> lootedItems = commandParts.subList(1, commandParts.size());
                    loot(lootedItems, treasure);
                    break;
                case "Drop":
                    drop(Integer.parseInt(commandParts.get(1)), treasure);
                    break;
                case "Steal":
                    List<String> stoleItems = steal(Integer.parseInt(commandParts.get(1)), treasure);
                    System.out.println(String.join(", ", stoleItems));
                    break;
                default:
                    throw new IllegalStateException("unknown command" + type);


            }


            command = scanner.nextLine();
        }
        if (!treasure.isEmpty()) {
            double avarageGain = 0;
            for (String item : treasure) {
                avarageGain += item.length();
            }
            avarageGain /= treasure.size();

            System.out.printf("Average treasure gain: %.2f pirate credits.%n", avarageGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }

    private static List<String> steal(int count, List<String> treasure) {
        List<String> stolen = new ArrayList<>();
        while(stolen.size()<count&&!treasure.isEmpty()) {
            int lastIndex=treasure.size()-1;
        stolen.add(treasure.remove(lastIndex));
        }


        //   for (int i = 0; i < count&&!treasure.isEmpty(); i++) {
        //
        //            String stolenItem=treasure.remove(treasure.size() - 1);
        //            stolen.add(stolenItem);
        //        }
               Collections.reverse(stolen);
        return stolen;
    }

    private static void drop(int index, List<String> treasure) {
        if (isValidIndex(index, treasure)) {
            String item = treasure.get(index);
            treasure.remove(index);
            treasure.add(item);
        }
    }

    private static boolean isValidIndex(int index, List<String> treasure) {
        return index >= 0 && index < treasure.size();
    }

    private static void loot(List<String> lootedItems, List<String> treasure) {
        for (String item : lootedItems) {
            if (!treasure.contains(item)) {
                treasure.add(0, item);
            }
        }

    }
}
