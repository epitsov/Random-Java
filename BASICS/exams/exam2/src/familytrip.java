import java.util.Scanner;

public class familytrip {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget= Double.parseDouble(scanner.nextLine());
        int nightsstay=Integer.parseInt(scanner.nextLine());
        double pricefornight=Double.parseDouble(scanner.nextLine());
        int additional=Integer.parseInt(scanner.nextLine());
        double costs=0;
        if(nightsstay>7)
        {costs=nightsstay*(pricefornight*0.95)+budget*additional/100;}
        else{costs=nightsstay*pricefornight+budget*additional/100;}
        if(budget>costs)
        {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget-costs);}
        else
        { System.out.printf("%.2f leva needed.",costs-budget);}
    }
}
