import java.util.Scanner;

public class bonuspoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double points = 0;
        if (x < 100) {
            points = 5;
        } else if (x < 1000) {
            points = x * 0.2;
        } else if(x>1000){
            points = x * 0.1;
        }
        if (x % 2 == 0) {
            points = points + 1;
        } else if (x % 10 == 5) {
            points = points + 2;
        }
        double y=x+points;
        System.out.printf("%.1f",points);
        System.out.println();
        System.out.printf("%.1f",y);


    }
}