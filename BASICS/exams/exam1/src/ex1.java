import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double pricebaklava= Double.parseDouble(scanner.nextLine());
        double pricemuffin=Double.parseDouble(scanner.nextLine());
        double KGschtollen= Double.parseDouble(scanner.nextLine());
        double KGcandy= Double.parseDouble(scanner.nextLine());
        int KGcookies=Integer.parseInt(scanner.nextLine());
        double priceschtollen=1.6*pricebaklava;
        double pricecandy=1.8*pricemuffin;
        double sum=priceschtollen*KGschtollen+pricecandy*KGcandy+7.5*KGcookies;
        System.out.printf("%.2f",sum);

    }
}
