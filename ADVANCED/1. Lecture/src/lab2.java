import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        String input = readInput();
        String[] symbols = input.split( "\\s+" );
        if (symbols.length == 0) {
            return;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push( Integer.parseInt( symbols[0] ) );
        for (int i = 1; i < symbols.length; i++) {
            String opperation = symbols[i];
            int number = Integer.parseInt( symbols[++i] );
            int stackNum=stack.pop();
            if("+".equals( opperation ))
            {stack.push( number+stackNum );}
            else if("-".equals( opperation ))
            {stack.push( stackNum-number );}

        }
        System.out.println(stack.pop());
    }

    private static String readInput() {
        Scanner scanner=new Scanner( System.in );
        return scanner.nextLine();
    }
}
