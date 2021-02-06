import java.util.Scanner;

public class ex6 {
    static void matrix(int x)
    {int input=x;
        for (int i = 0; i <x ; i++) {
            System.out.print(input+" ");
            for (int j = 1; j < x; j++) {
                System.out.print(input+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        matrix(x);
    }
}
