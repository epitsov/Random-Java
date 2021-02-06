import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        int maxcapacity = Integer.parseInt(scanner.nextLine());
        String[] input1 = scanner.nextLine().split("\\s+");
        while (!input1[0].equals("end")) {
            if (input1[0].equals("Add")) {
                int num = Integer.parseInt(input1[1]);
                numbers.add(num);
            } else  {
                int num1 = Integer.parseInt(input1[0]);
                for (int i = 0; i <numbers.size() ; i++) {
                    if(numbers.get(i)<=maxcapacity&&numbers.get(i)+num1<=maxcapacity)
                    {numbers.set(i,numbers.get(i)+num1);
                    break;}
                }

            }
            input1 = scanner.nextLine().split("\\s+");
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

}

