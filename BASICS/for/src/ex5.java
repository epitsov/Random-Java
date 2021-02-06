import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 200) {
                p1++;
            } else if (input >= 200 && input <= 399) {
                p2++;
            } else if (input >= 400 && input <= 599) {
                p3++;
            } else if (input >= 600 && input <= 799) {
                p4++;
            } else if (input >= 800) {
                p5++;
            }

        }
        double sum=p1+p2+p3+p4+p5;
        double prozent1=(p1/sum)*100;
        double prozent2=(p2/sum)*100;
        double prozent3=(p3/sum)*100;
        double prozent4=(p4/sum)*100;
        double prozent5=(p5/sum)*100;
        System.out.printf("%.2f%%%n " ,prozent1);
        System.out.printf("%.2f%%%n " ,prozent2);
        System.out.printf("%.2f%%%n " ,prozent3);
        System.out.printf("%.2f%%%n " ,prozent4);
        System.out.printf("%.2f%%%n " ,prozent5);
    }

}
