import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String bannedWord : bannedWords) {
            while (text.contains(bannedWord)) {
                text = text.replace(bannedWord, repeat( "*", bannedWord.length()));
            }
        }


        System.out.println(text);
    }

    static String repeat(String s, int repeatCount) {
        String[] copies = new String[repeatCount];
        for (int i = 0; i < copies.length; i++) {
            copies[i] = s;
        }
        return String.join("", copies);
    }
}
