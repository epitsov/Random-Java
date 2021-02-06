import java.util.Scanner;

public class poolday {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberofpeople= Integer.parseInt(scanner.nextLine());
        double entrance=Double.parseDouble(scanner.nextLine());
        double coach= Double.parseDouble(scanner.nextLine());
        double umbrella=Double.parseDouble(scanner.nextLine());
        double pricecoach=coach*(Math.ceil(0.75*numberofpeople));
        double priceumbrella=(Math.ceil(numberofpeople*0.5))*umbrella;
        double sum=(numberofpeople*entrance)+pricecoach+priceumbrella;
        System.out.printf("%.2f lv.",sum);
    }
}
