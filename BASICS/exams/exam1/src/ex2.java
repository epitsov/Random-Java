import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double moneyneeded= Double.parseDouble(scanner.nextLine());
        int fantacybooks=Integer.parseInt(scanner.nextLine());
        int horrorbooks=Integer.parseInt(scanner.nextLine());
        int romaticbooks=Integer.parseInt(scanner.nextLine());
        double moneycollected=(14.9*fantacybooks+9.8*horrorbooks+4.3*romaticbooks);


        if(moneycollected>moneyneeded)
        {System.out.printf("%.2f leva donated.\n",moneycollected);
            System.out.printf("Seller will recieve %.0f leva.\n",0.1*(moneycollected-moneyneeded));
        }
        else {
            System.out.printf("%.2f money needed.",(moneyneeded-moneycollected));
        }
        }
    }

