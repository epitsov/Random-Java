import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Double radius= Double.parseDouble(scanner.nextLine());
        double area= radius*Math.PI*radius;
        double perimeter= 2*Math.PI*radius;
        System.out.printf("%.2f",area);
        System.out.println();
        System.out.printf("%.2f",perimeter);


    }
}
