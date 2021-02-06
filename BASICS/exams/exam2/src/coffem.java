import java.util.Scanner;

public class coffem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bevarage = scanner.nextLine();
        String type = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double pricee = 0;
        double total = 0;
        if (bevarage.equals("Espresso")) {
            if (type.equals("Without")) {
                if(number<5){
                    pricee = 0.9*0.65;}
                else {
                    pricee = 0.9 * 0.65*0.75;
                }}
            else if (type.equals("Normal")) {
                if(number<5){
                    pricee = 1;}
                else
                {pricee=1*0.75;
            }}
            else {if(number<5){
                pricee = 1.2;}
                    else
                    {pricee=1.2*0.75;
            }
        }}
        else if (bevarage.equals("Cappuccino")) {
            if (type.equals("Without")) {
                pricee = 1*0.65;
            }

            else if (type.equals("Normal")) {
                pricee = 1.2;
            }

            else {
                pricee = 1.6;
            }
        }
        else {
            if (type.equals("Without")) {
                pricee = 0.5*0.65;
            }
            else if (type.equals("Normal")) {
                pricee = 0.6;
            }
            else {
                pricee = 0.7;
            }
        }
total=pricee*number;
        if(total>=15)
        {
            System.out.printf("You bought %d cups of Espresso for %.2f lv.",number,total*0.8
            );
        }
        else
        {            System.out.printf("You bought %d cups of Espresso for %.2f lv.",number,total);
        }

    }
}
