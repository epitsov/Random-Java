import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        String[] input1 = scanner.nextLine().split("\\s+");
        while (!input1[0].equals("End")) {
            if (input1[0].equals("Add")) {
                int x = Integer.parseInt(input1[1]);
                numbers.add(x);
            } else if (input1[0].equals("Insert")) {

                int number = Integer.parseInt(input1[1]);
                int index = Integer.parseInt(input1[2]);
                if (index>numbers.size()-1)
                {
                    System.out.println("Invalid index");
                }
                else{
                numbers.add(index, number);}
            } else if (input1[0].equals("Remove")) {
                int x = Integer.parseInt(input1[1]);
                if (x>numbers.size()-1)
                {
                    System.out.println("Invalid index");
                }
                else{
                numbers.remove(x);}
            } else if (input1[1].equals("left")) {
                int x = Integer.parseInt(input1[2]);
                for (int i = 0; i < x; i++) {
                    int number = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(number);
                }
            } else if (input1[1].equals("right")) {
                int x = Integer.parseInt(input1[2]);

                for (int i = 0; i < x; i++) {
                    int number = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, number);
                }
            }

            input1 = scanner.nextLine().split("\\s+");
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

}

