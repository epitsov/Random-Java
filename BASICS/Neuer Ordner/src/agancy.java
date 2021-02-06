import java.util.Scanner;

public class agancy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String airline=scanner.nextLine();
        int numberoftickets=Integer.parseInt(scanner.nextLine());
        int numberofkids=Integer.parseInt(scanner.nextLine());
        double price=Double.parseDouble(scanner.nextLine());
        double tax=Double.parseDouble(scanner.nextLine());
        double kidstprice=price*0.3;
        double totalprice=kidstprice+tax;
        double adultsprice=price+tax;
        double sum=adultsprice*numberoftickets+totalprice*numberofkids;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",airline,0.2*sum);

    }

}
