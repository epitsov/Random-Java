import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clas = scanner.nextLine();
        double distance = Double.parseDouble(scanner.nextLine());
        int passangers = Integer.parseInt(scanner.nextLine());
        double ticketprice = 0;
        if (clas.equals("Economy")) {
            if (distance < 1500) {
                ticketprice = 59.99;
            } else if (distance <= 3500) {
                ticketprice = 184.99;
            } else {
                ticketprice = 269.99;
            }
        } else if (clas.equals("Premium")) {
            if (distance < 1500) {
                ticketprice = 179.99;
            } else if (distance <= 3500) {
                ticketprice = 279.99;
            } else {
                ticketprice = 394.99;
            }
        } else {
            if (distance < 1500) {
                ticketprice = 254.99;
            } else if (distance <= 3500) {
                ticketprice = 379.99;
            } else {
                ticketprice = 619.99;
            }
        }
        if(passangers<=6) {
            System.out.printf("The total price of the tickets is: %.2f lv.", ticketprice * passangers);
        }
    else
        {System.out.printf("The total price of the tickets is: %.2f lv.", 0.8*(ticketprice * passangers));}}
}
