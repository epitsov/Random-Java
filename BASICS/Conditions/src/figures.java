import java.util.Scanner;

public class figures {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String x= scanner.nextLine();
        double area=0.00;
        if (x.equals("square"))
        {
            double z= Double.parseDouble(scanner.nextLine());
           area= z*z;
        }
        else if (x.equals("rectangle"))
        {
            double z= Double.parseDouble(scanner.nextLine());
            double y= Double.parseDouble(scanner.nextLine());
            area= y*z;
        }
        else if (x.equals("circle"))
        {
            double z= Double.parseDouble(scanner.nextLine());
            area= (Math.PI)*z*z;
        }
        else{
            double z= Double.parseDouble(scanner.nextLine());
            double y= Double.parseDouble(scanner.nextLine());
            area= (y*z)/2;

        }
        System.out.printf("%.3f",area);
    }
}
