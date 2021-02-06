import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x1=Double.parseDouble(scanner.nextLine());
        double y1=Double.parseDouble(scanner.nextLine());
        double x2=Double.parseDouble(scanner.nextLine());
        double y2=Double.parseDouble(scanner.nextLine());
        double x=Double.parseDouble(scanner.nextLine());
        double y=Double.parseDouble(scanner.nextLine());
        boolean firstcondtion= (x==x1||x==x2)&&(y>=y1&&y<=y2);
        boolean secondcondtion= (y==y1||y==y2)&&(x>=x1&&x<=x2);
        if(firstcondtion||secondcondtion)
        {
            System.out.println("Border");
        }
        else
        {
            System.out.println("Inside / Outside");
        }
    }
}
