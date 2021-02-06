import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x=Integer.parseInt(scanner.nextLine());
        double v=0;
        String maxname="";
String name="";
        double maxkeg=-1000000000;
        for (int i = 0; i <x ; i++) {
             name=scanner.nextLine();
            float r=Float.parseFloat(scanner.nextLine());
            int h=Integer.parseInt(scanner.nextLine());
            double r2=r*r;
            v=Math.PI*r2 *h;
            if(v>maxkeg)
            {maxkeg=v;
                maxname=name;}
        }
        System.out.println(maxname);
    }
}
