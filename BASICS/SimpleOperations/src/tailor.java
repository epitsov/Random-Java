import java.util.Scanner;

public class tailor {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= Integer.parseInt(scanner.nextLine());
        double lenght= Double.parseDouble(scanner.nextLine());
        double width= Double.parseDouble(scanner.nextLine());
        double qm=number*((lenght+2*0.30)*(width+2*0.30));
        double qm1=number*((lenght/2)*(lenght/2));
        double price= qm*7+qm1*9;
        double bgn=price*1.85;
        System.out.printf("%.2f USD",price);
        System.out.println();
        System.out.printf("%.2f BGN",bgn);



    }
}
