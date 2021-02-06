import java.util.Scanner;

public class ex8 {
    static int factorial(int n)
    {int result=1;
        for (int i = 1; i <=n ; i++) {
            result*=i;
        }
    return result;}
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int input1=scanner.nextInt();
        int input2=scanner.nextInt();

        int result1=factorial(input1);
        int result2=factorial(input2);
        System.out.println(result1/result2);
    }
}
