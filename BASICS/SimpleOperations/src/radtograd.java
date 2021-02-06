import java.util.Scanner;

public class radtograd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double rad= Double.parseDouble(scanner.nextLine());
        double grad=rad*180/Math.PI;
        System.out.printf("%.0f",grad);

    }}
