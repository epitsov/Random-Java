import java.util.Scanner;

public class volleyball {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String year= scanner.nextLine();
        double p= Double.parseDouble(scanner.nextLine());
        double h= Double.parseDouble(scanner.nextLine());
        double times1=48-h;
        double times2=(times1*3)/4;
        double times3=(times2+h);
        double time4=(p*2)/3;
        double times=time4+times3;
if (year.equals("leap")){
            double timee=Math.floor(1.15*times);
            System.out.printf("%.0f",timee);
        }
else if(year.equals("normal"))
        {    double timee=Math.floor(times);
            System.out.printf("%.0f",timee);}
    }
}
