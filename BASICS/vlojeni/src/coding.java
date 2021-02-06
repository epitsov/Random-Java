import java.util.Scanner;

public class coding {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        for(int i=input.length()-1;i>=0;i--)
        {char digit=input.charAt(i);
        int number=Integer.parseInt(""+digit);
        if(number==0)
        {
            System.out.println("ZERO");
            continue;}
            for(int n=1;n<=number;n++)
            {
                System.out.print((char)(number+33));
            }
            System.out.println();
        }
    }
}
