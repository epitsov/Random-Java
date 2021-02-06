import java.util.Scanner;

public class charity {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int days= Integer.parseInt(scanner.nextLine());
        int bakers= Integer.parseInt(scanner.nextLine());
        int cakes= Integer.parseInt(scanner.nextLine());
        int waffel= Integer.parseInt(scanner.nextLine());
        int crepes= Integer.parseInt(scanner.nextLine());
        double onebaker=45*cakes+5.8*waffel+3.2*crepes;
        double oneday=bakers*onebaker;
        double festival=days*oneday;
        double festival1=festival-(festival/8);
        System.out.printf("%.2f",festival1);


    }
}
