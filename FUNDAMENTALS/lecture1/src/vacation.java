import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double totalprice = 0;
        if (type.equals("Students")) {
            if (day.equals("Friday")) {
                if(number>=30)
                {totalprice=0.85*(8.45*number);
                    System.out.printf("Total price: %.2f",totalprice);}
                else
                {totalprice=(8.45*number);
                    System.out.printf("Total price: %.2f",totalprice);}
            } else if (day.equals("Saturday")) {
                if(number>=30)
                {totalprice=0.85*(9.8*number);
                    System.out.printf("Total price: %.2f",totalprice);}
                else
                {totalprice=(9.8*number);
                    System.out.printf("Total price: %.2f",totalprice);}
            } else if (day.equals("Sunday")) {
                if(number>=30)
                {totalprice=0.85*(10.46*number);
                    System.out.printf("Total price: %.2f",totalprice);}
                else
                {totalprice=(10.46*number);
                    System.out.printf("Total price: %.2f",totalprice);}
            }
        }
        else if(type.equals("Business"))
        {if (day.equals("Friday")) {
            if(number>=100)
            {totalprice=10.9*(number-10);
                System.out.printf("Total price: %.2f",totalprice);}
            else
            {totalprice=(10.9*number);
                System.out.printf("Total price: %.2f",totalprice);}
        } else if (day.equals("Saturday")) {
            if(number>=100)
            {totalprice=15.6*(number-10);
                System.out.printf("Total price: %.2f",totalprice);}
            else
            {totalprice=(15.6*number);
                System.out.printf("Total price: %.2f",totalprice);}
        } else if (day.equals("Sunday")) {
            if(number>=30)
            {totalprice=16*(number-10);
                System.out.printf("Total price: %.2f",totalprice);}
            else
            {totalprice=(16*number);
                System.out.printf("Total price: %.2f",totalprice);}
        }


        }
        else
        {if (day.equals("Friday")) {
            if(number>=10&&number<=20)
            {totalprice=0.95*(15*number);
                System.out.printf("Total price: %.2f",totalprice);}
            else
            {totalprice=(15*number);
                System.out.printf("Total price: %.2f",totalprice);}
        } else if (day.equals("Saturday")) {
            if(number>=10&&number<=20)
            {totalprice=0.95*(20*number);
                System.out.printf("Total price: %.2f",totalprice);}
            else
            {totalprice=(20*number);
                System.out.printf("Total price: %.2f",totalprice);}
        } else if (day.equals("Sunday")) {
            if(number>=10&&number<=20)
            {totalprice=0.95*(22.5*number);
                System.out.printf("Total price: %.2f",totalprice);}
            else
            {totalprice=(22.5*number);
                System.out.printf("Total price: %.2f",totalprice);}}

    }
}}
