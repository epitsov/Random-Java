import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x= Integer.parseInt(scanner.nextLine());
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<x;i++)
        {int input= Integer.parseInt(scanner.nextLine());
         sum  += input;
         max=Math.max(max,input);}
         if((sum-max)==max) {
             System.out.println("Yes");
             System.out.printf("Sum = %d",max);}
         else{ int z=Math.abs(sum-max);
             System.out.println("No");
             System.out.printf("Diff = %d",Math.abs(max-z));
         }



    }
}
