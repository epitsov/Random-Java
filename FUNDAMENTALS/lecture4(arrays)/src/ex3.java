import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = n;
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        while (n > 0) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            if (n % 2 == 0) {
                array1[Math.abs(x - n)] = x2;
                array2[Math.abs(x - n)] = x1;
            } else {
                array1[Math.abs(x - n)] = x1;
                array2[Math.abs(x - n)] = x2;
            }
            n--;
        }

        for(int num2:array2)
        {
            System.out.print(num2+" ");

        }
        System.out.println();
        for(int num:array1)
        {
            System.out.print(num+" ");
        }
    }
}
