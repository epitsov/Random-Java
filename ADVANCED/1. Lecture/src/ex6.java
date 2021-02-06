import java.util.ArrayDeque;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String paretheses = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String lookupTable = "{([";
        boolean areBalance=true;
        for (int i = 0; i < paretheses.length(); i++) {
            char symbol = paretheses.charAt( i );
            if (lookupTable.contains( symbol + "" )) {
                stack.push( symbol );
            } else {
                if (stack.isEmpty()) {
                    areBalance=false;
                    break;
                }
                char top = stack.pop();
                if(!(top=='('&&symbol==')'||top=='{'&&symbol=='}'||top=='['&&symbol==']'))
                {areBalance=false;
                break;}
            }
        }
        String ouput=areBalance?"YES":"NO";
        System.out.println(ouput);
    }
}
