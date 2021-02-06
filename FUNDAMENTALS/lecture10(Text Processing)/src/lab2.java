import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = scanner.nextLine();

        int wordIndex = text.indexOf(word);
        // while (text.contains(word)) {
        //   text = text.replace(word, "");
        //}
        while (wordIndex != -1) {
            String before = text.substring(0, wordIndex);
            String after = text.substring(wordIndex + word.length());
            text = before + after;
            wordIndex = text.indexOf(word);
        }
        System.out.println(text);
    }
}
