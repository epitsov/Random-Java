import java.util.Scanner;

public class swim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double z = Double.parseDouble(scanner.nextLine());
        double time=(z*y);
        double c=y/15;
        double up=Math.floor(c);
        double v=Math.floor(up*12.5);
        time=v+time;


        if(x<time){
            double u=time-x;
            System.out.printf("No, he failed! He was %.2f seconds slower."
                    ,u);
        }
        else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds."
                    ,time);}
    }
}

