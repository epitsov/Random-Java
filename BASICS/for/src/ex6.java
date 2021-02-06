import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
double p=0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input %2==0) {
                p1++;
            } if (input %3==0) {
                p2++;
            }  if (input%4==0) {
                p3++;}
            else{p++;}


        }

        double prozent1=(p1/n)*100;
        double prozent2=(p2/n)*100;
        double prozent3=(p3/n)*100;

        System.out.printf("%.2f%%%n " ,prozent1);
        System.out.printf("%.2f%%%n " ,prozent2);
        System.out.printf("%.2f%%%n " ,prozent3);

    }

}
