import java.util.*;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> stuff:words.entrySet()) {
            System.out.print(stuff.getKey());
            System.out.print(" - ");
            System.out.print(String.join(", ",stuff.getValue()));
            System.out.println();

        }


    }
}
