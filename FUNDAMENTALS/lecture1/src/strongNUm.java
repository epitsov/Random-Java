import java.util.Scanner;

public class strongNUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int x = number.length();
        int x1=Integer.parseInt(number);
        String z = "";
        char y;
        int sum = 1;
        int sum1=0;
        for (int i = 0; i < x; i++) {
            sum=1;
            z="";
            y = number.charAt(i);
            z += y;
            int numberparsed = Integer.parseInt(z);
            int u = numberparsed;
            while (numberparsed > 0) {
                u--;
                if (u==0)
                {break;}
                sum *= (numberparsed * u);
                numberparsed = 1;
            }
        sum1+=sum;}
            if(sum1==x1)
            {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }

