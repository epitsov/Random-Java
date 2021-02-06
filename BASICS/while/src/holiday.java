import java.util.Scanner;

public class holiday {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double moneyforholiday=Double.parseDouble(scanner.nextLine());
        double moneysaved=Double.parseDouble(scanner.nextLine());
        int dayssaved=0;
        int dayspend=0;
        while(moneysaved<moneyforholiday) {
        String operation=scanner.nextLine();
        if(operation.equals("spend")) {
            double costs=Double.parseDouble(scanner.nextLine());
            moneysaved-=costs;
            dayspend++;
            if(moneysaved<0)
            {moneysaved=0;}
            if(dayspend==5)
            {break;}
        }
            if(operation.equals("save")) {
                double savings=Double.parseDouble(scanner.nextLine());
                moneysaved+=savings;
                dayspend=0;
            }
        dayssaved++;
        }
        if(dayspend>=5)
        {
            System.out.printf("You can't save the money.\n%d",dayspend);}
        else{
        System.out.printf("You saved the money for %d days.",dayssaved);
        }}
    }

