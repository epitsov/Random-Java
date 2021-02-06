import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stage = scanner.nextLine();
        String tickettype = scanner.nextLine();
        int numberoftickets = Integer.parseInt(scanner.nextLine());
        char trophy = scanner.nextLine().charAt(0);
        double singleticket = 0;
        double totalprice = 0;
        if (stage.equals("Quarter final")) {
            if (tickettype.equals("Standard")) {
                singleticket = 55.5;

            }
            if (tickettype.equals("Premium")) {
                singleticket = 105.2;
            }
            if (tickettype.equals("VIP")) {
                singleticket = 118.9;
            }
        } else if (stage.equals("Semi final")) {
            if (tickettype.equals("Standard")) {
                singleticket = 75.88;

            }
            if (tickettype.equals("Premium")) {
                singleticket = 125.22;
            }
            if (tickettype.equals("VIP")) {
                singleticket = 300.4;
            }
        } else if (stage.equals("Final")) {
            if (tickettype.equals("Standard")) {
                singleticket = 110.1;

            }
            if (tickettype.equals("Premium")) {
                singleticket = 160.66;
            }
            if (tickettype.equals("VIP")) {
                singleticket = 400;
            }
        }
        totalprice = numberoftickets * singleticket;
        if (totalprice > 4000) {
            totalprice = totalprice * 0.75;
            System.out.printf("%.2f",totalprice);
        }
        else if (totalprice > 2500) {
            totalprice = totalprice * 0.9;
            if (trophy == 'Y') {
                totalprice = 40 * numberoftickets+totalprice;
                System.out.printf("%.2f",totalprice);
            } else {
                System.out.printf("%.2f",totalprice);
            }
        }
        else{if (trophy == 'Y') {
            totalprice = 40 * numberoftickets+totalprice;
            System.out.printf("%.2f",totalprice);
        } else {
            System.out.printf("%.2f",totalprice);}

    }}}

