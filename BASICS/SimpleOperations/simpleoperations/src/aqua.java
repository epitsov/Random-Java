import java.util.Scanner;

public class aqua {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int lenght= Integer.parseInt(scanner.nextLine());
        int with= Integer.parseInt(scanner.nextLine());
        int hight= Integer.parseInt(scanner.nextLine());
        double percent= Double.parseDouble(scanner.nextLine())/100;
        int volume= lenght*with*hight;
        double liters= volume*0.001;
        double result= liters-liters*percent;
        System.out.printf("%.3f",result);


    }
}
