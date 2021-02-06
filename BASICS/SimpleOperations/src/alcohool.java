import java.util.Scanner;

public class alcohool
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double price= Double.parseDouble(scanner.nextLine());
        double beer= Double.parseDouble(scanner.nextLine());
        double wine= Double.parseDouble(scanner.nextLine());
        double rakia= Double.parseDouble(scanner.nextLine());
        double whiskey= Double.parseDouble(scanner.nextLine());
        double pricer=price*0.5;
        double pricew=pricer-pricer*0.4;
        double priceb=pricer-pricer*0.8;
        double priceall=price*whiskey+priceb*beer+pricew*wine+
                pricer*rakia;
        System.out.printf("%.2f",priceall);


    }
}
