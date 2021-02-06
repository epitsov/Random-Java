import java.util.Scanner;

public class Numbertriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int number = 0;
        for(int i = 1; i <= x; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.print("\n");
        }
        }
    }
