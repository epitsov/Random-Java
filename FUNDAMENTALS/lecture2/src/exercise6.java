import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        for (int i = 97; i < 97 + x; i++) {


            for (int j = 97; j < 97 + x; j++) {


                for (int l = 97; l < 97 + x; l++) {

                    System.out.printf("%c%c%c%n", i, j, l);
                }
            }
        }

    }
}
