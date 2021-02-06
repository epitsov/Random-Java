import java.util.Scanner;

public class sumofnumbers5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        while(n-->0)
        {int num=Integer.parseInt(scanner.nextLine());
        sum+=num;}
        System.out.println(sum);
    }
}
