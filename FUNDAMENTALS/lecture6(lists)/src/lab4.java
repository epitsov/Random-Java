import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//4 53 6 8 43 3
public class lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split("\\s+");
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < input1.length; i++) {
            number.add(Integer.parseInt(input1[i]));
        }
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] inp = line.split("\\s");

            if (inp[0].equals("Add")) {
                int addNum = Integer.parseInt(inp[1]);
                number.add(addNum);
            } else if (inp[0].equals("Remove")) {
                int removeNum = Integer.parseInt(inp[1]);
                number.remove(removeNum);

            } else if (inp[0].equals("RemoveAt")) {
                int index = Integer.parseInt(inp[1]);
                number.remove(index);
            } else {
                int number1 = Integer.parseInt(inp[1]);
                int index = Integer.parseInt(inp[2]);
                number.add(index,number1);
            }

            line = scanner.nextLine();
        }
        for (Integer x : number) {
            System.out.print(x + " ");
        }


    }
}
