import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inpur = scanner.nextLine().split(", ");
        List<String> items = new ArrayList<>(Arrays.asList(inpur));
        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] arrComs = input.split(" - ");
            String command = arrComs[0];
            String item = arrComs[1];
            switch (command) {
                case "Collect":
                    if (!itemexist(item, items)) {
                        items.add(item);
                    }
                    break;
                case "Drop":
                    if (itemexist(item, items)) {
                        items.remove(item);
                    }
                    break;
                case "Combine Items": {
                    String tokens = arrComs[1];
                    String[] tokensSplit = tokens.split(":");
                    String olditem = tokensSplit[0];
                    String newitem = tokensSplit[1];
                    if (itemexist(olditem, items)) {
                        int oldItemIndex = items.indexOf(olditem);
                        items.add(oldItemIndex + 1, newitem);

                    }
                    break;
                }
                case "Renew":
                    if (itemexist(item, items)) {
                        itemreplace(item, items);
                    }
                    break;


            }

            input = scanner.nextLine();
        }
        for (int i = 0; i <items.size() ; i++) {
            if(i==items.size()-1)
            {
                System.out.print(items.get(i));
            }
            else
            {                System.out.print(items.get(i)+", ");
            }
        }
    }

    private static void itemreplace(String item, List<String> items) {
        int removedIndex = items.indexOf(item);
        String itemRemoved=items.get(removedIndex);
        items.remove(item);
        items.add(itemRemoved);
    }

    private static boolean itemexist(String item, List<String> items) {
        for (String s : items) {
            if (s.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
