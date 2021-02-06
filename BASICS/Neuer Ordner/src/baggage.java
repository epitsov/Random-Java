import javax.swing.*;
import java.util.Scanner;

public class baggage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double over=Double.parseDouble(scanner.nextLine());
        double kgover=Double.parseDouble(scanner.nextLine());
        int daystotrip= Integer.parseInt(scanner.nextLine());
        int numberofbags=Integer.parseInt(scanner.nextLine());
        double price=0.0;
        if (kgover<=10)
        {price=over*0.2;}
        else if(kgover>10&&kgover<=20)
        {price=over*0.5;}
        else{price=over;}
        if(daystotrip>30)
        {price=price*1.1;}
        else if(daystotrip>7)
        {price=price*1.15;}
        else{price=price*1.4;}
        System.out.printf("The total price of bags is: %.2f lv.",price*numberofbags);

    }
}
