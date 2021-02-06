import java.util.Scanner;

public class club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price=0;
        double income = Double.parseDouble(scanner.nextLine());
        double totalincome=0;
        while (income > 0) {
            String cocktail = scanner.nextLine();
            if(cocktail.equals("Party!"))
            {break;}
            int number = Integer.parseInt(scanner.nextLine());
            price=cocktail.length()*number;
            if(price%2!=0)
            {price=price*0.75;}
            totalincome+=price;
            income-=price;

        }
        if(income<=0)
        {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.",totalincome);
        }
        else{
            System.out.printf("We need leva %.2f leva more.",income);
            System.out.printf("Club income- %.2f leva.",totalincome);
        }
    }
}

