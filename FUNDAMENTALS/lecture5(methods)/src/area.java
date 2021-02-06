import java.util.Scanner;

public class area {
    static  void area (int a, int b)
    {
        System.out.println(a*b);
    }
    public static double mathPower(double number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++){
            result *= number;}
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double x1=scanner.nextDouble();
        int x2=scanner.nextInt();
        double result=mathPower(x1,x2);
        System.out.printf("%.1f",result);
    }
}
