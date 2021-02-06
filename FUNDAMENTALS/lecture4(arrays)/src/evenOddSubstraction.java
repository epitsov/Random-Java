import java.util.Scanner;

public class evenOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        String []items=values.split(" ");
        int []numbers= new int[items.length];
        for (int i = 0; i <items.length ; i++) {
            numbers[i]=Integer.parseInt(items[i]);
        }
        int sumeven = 0;
        int sumodd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumeven += number;
            } else {
                sumodd += number;
            }
        }
        System.out.println(sumeven - sumodd);
    }
}
