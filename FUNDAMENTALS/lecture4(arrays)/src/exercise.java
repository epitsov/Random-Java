import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] numbers = new int[n];
        int[] numbers1 = {1,2,3};
        for(int i=0;i<numbers.length;i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]*=2;
        }
        for (int i = numbers.length-1; i <= 0; i--) {


            System.out.println(numbers[i]);
        }
    }
}
