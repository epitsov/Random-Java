import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Deque<String> history = new ArrayDeque<>();
        while (true) {
            String line = scanner.nextLine();
            String output = "";
            switch (line) {
                case "back":
                    if (history.size() <= 1) {
                        output = "no previous URLs";
                    } else {
                        history.pop();
                        output = history.peek();
                    }
                    break;
                case "Home":
                    break;
                default:
                    output = line;
                    history.push( line );
            }
            System.out.println( output );
        }
    }
}
