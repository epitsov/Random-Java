import java.util.Scanner;

public class vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double x = Double.parseDouble(input);
        double y = 0;
        double sum=0;
        if (x != 2.0 && x != 1.0 && x != 0.5 && x != 0.2 && x != 0.1) {
            System.out.printf("Cannot accept %.2f\n", x);
        }
        else{
         sum=x;}
        while (!input.equals("Start")) {
            input = scanner.nextLine();
if(input.equals("Start"))
{break;}
            y = Double.parseDouble(input);


            if (y != 2.0 && y != 1.0 && y != 0.5 && y != 0.2 && y != 0.1) {
                System.out.printf("Cannot accept %.2f\n", y);
            } else {
                sum += y;
            }

        }
        String input2 = scanner.nextLine();
        while (!input2.equals("End")) {
            if (input2.equals("Nuts")) {
                sum -= 2;
                if(sum<0)
                {
                    System.out.println("Sorry, not enough money");
                    sum+=2;
                }
                else{
                    System.out.println("Purchased Nuts");
                }
            }
            else if (input2.equals("Water")) {
                sum -= 0.7;
                if(sum<0)
                {
                    System.out.println("Sorry, not enough money");
                    sum+=0.7;
                }
                else{
                    System.out.println("Purchased Water");
                }
            }
            else if (input2.equals("Crisps")) {
                sum -= 1.5;
                if(sum<0)
                {
                    System.out.println("Sorry, not enough money");
                    sum+=1.5;
                }
                else{
                    System.out.println("Purchased Crisps");
                }
            }
            else if (input2.equals("Soda")) {
                sum -= 0.8;
                if(sum<0)
                {
                    System.out.println("Sorry, not enough money");
                    sum+=0.8;
                }
                else{
                    System.out.println("Purchased Soda");
                }
            }
            else if (input2.equals("Coke")) {
                sum -= 1;
                if(sum<0)
                {
                    System.out.println("Sorry, not enough money");
                    sum+=1;
                }
                else{
                    System.out.println("Purchased Coke");
                }
            }
            else
            {
                System.out.println("Invalid product");
            }
            input2 = scanner.nextLine();


        }
        System.out.printf("Change: %.2f",sum);
    }
}
