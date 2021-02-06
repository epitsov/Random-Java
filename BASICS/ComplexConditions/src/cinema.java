import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String premier= scanner.nextLine();
        int line= Integer.parseInt(scanner.nextLine());
        int row= Integer.parseInt(scanner.nextLine());
        double price=0.0;
        if(premier.equals("Premiere"))
        {price=12;}
        else if(premier.equals("Normal"))
        {price=7.5;}
        else if(premier.equals("Discount"))
        {price=5.0;}
        else{
            System.out.println("error");
        }
        System.out.printf("%.2f leva",price*row*line);
    }
}
