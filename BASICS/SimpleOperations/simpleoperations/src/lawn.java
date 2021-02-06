import java.util.Scanner;

public class lawn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double m= Double.parseDouble(scanner.nextLine());
        double price= m*7.61;
        double discount= price*0.18;
        double price1= price-discount;
        System.out.printf("The final price is: %.2f lv.",price1);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.",discount);
    }
}
