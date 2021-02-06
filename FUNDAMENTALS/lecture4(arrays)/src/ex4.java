import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String array[] = input.split(" ");
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            String currentStr = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j+1];

            }
            array[array.length-1]=currentStr;
        }
        System.out.println(String.join(" ", array));
    }
}
