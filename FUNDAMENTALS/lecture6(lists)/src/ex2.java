import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        String[] input1 = scanner.nextLine().split("\\s+");
        while (!input1[0].equals("end")) {
            if (input1[0].equals("Delete"))
            {int x1= Integer.parseInt(input1[1]);
                for (int i = 0; i <numbers.size() ; i++) {
                    if(numbers.get(i)==x1)
                    {numbers.remove(i);
                    i=0;}
                }}
            else if(input1[0].equals("Insert"))
            {int element= Integer.parseInt(input1[1]);
            int position= Integer.parseInt(input1[2]);
            numbers.add(position,element);}


            input1 = scanner.nextLine().split("\\s+");
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

}