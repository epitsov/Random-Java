import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=Integer.parseInt(scanner.nextLine());

       if(x%2==0&&x%5==0)
        {
            System.out.println("The number is divisible by 10");
        }
        else if(x%2==0&&x%3==0)
        {
            System.out.println("The number is divisible by 6");
        }
       else if(x%7==0)
       {
           System.out.println("The number is divisible by 7");
       }

        else if(x%3==0)
        {
            System.out.println("The number is divisible by 3");
        }
       else if(x%2==0)
       {
           System.out.println("The number is divisible by 2");
       }
        else
        {
            System.out.println("Not divisible");
        }
    }
}
