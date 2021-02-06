import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x= scanner.nextInt();
        int y=scanner.nextInt();
        for (int i=x;i<=y;i++)
        {char z=(char)i;
            System.out.print(z+" ");

        }
    }
}
