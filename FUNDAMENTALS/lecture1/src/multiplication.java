import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x= Integer.parseInt(scanner.nextLine());
        int y=Integer.parseInt(scanner.nextLine());
        if(y>10)
        {
            System.out.printf("%d X %d = %d\n",x,y,x*y);
        }
        for(int i=y;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n",x,i,x*i);
        }
    }
}
