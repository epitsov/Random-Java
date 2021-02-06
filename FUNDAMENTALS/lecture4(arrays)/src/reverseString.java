import java.util.Scanner;

public class reverseString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String values = scanner.nextLine();
            String []items=values.split(" ");

            for (int i = items.length-1; i >=0 ; i--) {
                System.out.print(items[i]+" ");
            }

        }
    }

