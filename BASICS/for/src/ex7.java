import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < x; i++) {
            String input = scanner.nextLine();
            if (input.equals("Facebook")) {
                salary -= 150;
                if(salary<=0)
                {break;}
            }
            if (input.equals("Instagram")) {
                salary -= 100;
                if(salary<=0)
                {break;}
            }
            if (input.equals("Reddit")) {
                salary -= 50;
                if(salary<=0)
                {break;}
            }}
            if(salary<=0)
            {
                System.out.println("You have lost your salary.");
            }
            else{
                System.out.println(salary);
            }
        }


}
