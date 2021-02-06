import java.util.Scanner;

public class skiholiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rate = scanner.nextLine();
        days = days - 1;
        double priceforsinglenight = 0.0;
        if (roomType.equals("room for one person")) {
            priceforsinglenight = 18;
        } else if (roomType.equals("apartment")) {
            priceforsinglenight = 25;
        } else {
            priceforsinglenight = 35;
        }
        double cost = priceforsinglenight * days;

            if (roomType.equals("apartment")) {
                if (days < 10) {
                    cost = cost * 0.7;

                } else if (days <= 15) {
                    cost = cost * 0.65;
                } else {
                    cost = cost * 0.5;
                }

            } else if (roomType.equals("president apartment")) {
                if (days < 10) {
                    cost = cost * 0.9;

                } else if (days <= 15) {
                    cost = cost * 0.85;
                } else {
                    cost = cost * 0.8;
                }

            }
            if(rate.equals("positive"))
            {cost=cost*1.25;}
            else{
                cost=cost*0.9;
            }
        System.out.printf("%.2f",cost);
        }

}
