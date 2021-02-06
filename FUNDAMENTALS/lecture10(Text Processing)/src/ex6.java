import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char baseLetter=input.charAt(0);
        StringBuilder output = new StringBuilder();
        output.append(baseLetter);
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (baseLetter!=currentChar) {
                output.append(currentChar);
                baseLetter=currentChar;
            }
        }


        System.out.println(output);
    }
}

