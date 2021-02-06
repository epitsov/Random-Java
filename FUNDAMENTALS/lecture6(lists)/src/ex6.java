import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        List<Integer> deck1 = new ArrayList<>();
        List<Integer> deck2 = new ArrayList<>();

        for (int i = 0; i < input1.length; i++) {
            deck1.add(Integer.parseInt(input1[i]));
        }
        for (int i = 0; i < input2.length; i++) {
            deck2.add(Integer.parseInt(input2[i]));
        }
        while (true) {
            if(deck1.size()==0)
            {break;}
            if(deck2.size()==0)
            {break;}
            if (deck1.get(0) > deck2.get(0)) {
                deck1.add(deck1.get(0));
                deck1.add(deck2.get(0));
                deck1.remove(0);
                deck2.remove(0);
            } else if (deck1.get(0) < deck2.get(0)) {
                deck2.add(deck2.get(0));
                deck2.add(deck1.get(0));
                deck2.remove(0);
                deck1.remove(0);
            }
            else if(deck1.get(0)==deck2.get(0))
            {deck1.remove(0);
            deck2.remove(0);}
        }
        int sum1 = 0;
        for (int i = 0; i < deck1.size(); i++) {
            sum1 += deck1.get(i);
        }
        int sum2 = 0;
        for (int i = 0; i < deck2.size(); i++) {
            sum2 += deck2.get(i);
        }
        if (sum1 > sum2) {
            System.out.println(String.format("First player wins! Sum: %d", sum1));
        } else {
            System.out.println(String.format("Second player wins! Sum: %d", sum2));
        }

    }
}
