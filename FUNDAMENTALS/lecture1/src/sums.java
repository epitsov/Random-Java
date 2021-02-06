import java.util.Scanner;

public class sums {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x= Integer.parseInt(scanner.nextLine());
        int y= Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i=x;i<=y;i++)
        {    sum+=i;
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.printf("Sum:%d",sum);
    }
}
