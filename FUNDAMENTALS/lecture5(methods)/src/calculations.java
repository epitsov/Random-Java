import java.util.Scanner;

public class calculations {
    static void water(double a)
    {double cash=a*1.00;
        System.out.printf("%.2f",cash);
    }
    static void coffee(int a)
    {double cash=a*1.50;
        System.out.printf("%.2f",cash);
    }
    static void coke(double a)
    {double cash=a*1.40;
        System.out.printf("%.2f",cash);
    }
    static void snacks(double a)
    {double cash=a*2.00;
        System.out.printf("%.2f",cash);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        int x1=scanner.nextInt();
       if(input.equals("coffee"))
       {coffee(x1);}
        else if(input.equals("water"))
        {water(x1);}
         else if(input.equals("coke"))
        {coke(x1);}
        else
        {snacks(x1);}
    }
}
