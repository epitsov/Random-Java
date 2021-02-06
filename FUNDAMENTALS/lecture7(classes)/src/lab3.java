import java.math.BigInteger;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int input = scanner.nextInt();
        BigInteger output= new BigInteger(String.valueOf(1));

        for (int i = 1; i <=input ; i++) {
output=output.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
        }
        System.out.println(output);
    }
}
