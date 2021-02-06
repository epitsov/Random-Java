import java.util.Scanner;

//плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//цена	2.50	1.20	0.85	1.45	2.70	5.50	3.85
//плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//цена	2.70	1.25	0.90	1.60	3.00	5.60	4.20
public class vegshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String veg = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        boolean isdayweek = day.equals("Monday") || day.equals("Tuesday") ||
                day.equals("Wednesday") || day.equals("Thursday") ||
                day.equals("Friday");
        boolean isweekend = day.equals("Saturday") || day.equals("Sunday");
        double price=0.0;
        if (isdayweek) {
            if (veg.equals("banana")) {
                price=2.5;
            } else if (veg.equals("apple")) {
                price=1.2;
            } else if (veg.equals("orange")) {
                price=0.85;
            } else if (veg.equals("grapefruit")) {
                price=1.45;
            } else if (veg.equals("kiwi")) {
                price=2.7;
            } else if (veg.equals("pineapple")) {
                price=5.5;
            } else if (veg.equals("grapes")) {
                price=3.85;
            }
        } else if(isweekend) {
            if (veg.equals("banana")) {
                price=2.7;
            } else if (veg.equals("apple")) {
                price=1.25;
            } else if (veg.equals("orange")) {
                price=0.9;
            } else if (veg.equals("grapefruit")) {
                price=1.60;
            } else if (veg.equals("kiwi")) {
                price=3;
            } else if (veg.equals("pineapple")) {
                price=5.6;
            } else if (veg.equals("grapes")) {
                price=4.2;
            }
        }
        if(price !=0){
        System.out.printf("%.2f",price*quantity);}
        else{
            System.out.println("error");
        }
    }
}
