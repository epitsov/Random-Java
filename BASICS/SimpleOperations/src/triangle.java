import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double x1= Double.parseDouble(scanner.nextLine());
        double y1= Double.parseDouble(scanner.nextLine());
        double x2= Double.parseDouble(scanner.nextLine());
        double y2= Double.parseDouble(scanner.nextLine());
        double x=x1-x2;
        double z=Math.abs(x);
        double y=y1-y2;
        double h=Math.abs(y);
        double s=z*h;
        double p=2*(z+h);
        System.out.printf("%.2f",s);
        System.out.println();
        System.out.printf("%.2f",p);

    }
}
