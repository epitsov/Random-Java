import java.util.Scanner;

public class numberTriangle {
    static void printTriagle(int size)
    {
        for (int i = 1; i <=size ; i++) {
            printRowofNumber(i);
        }
        for (int i = size-1; i >=1 ; i--) {
            printRowofNumber(i);

        }
    }

    private static void printRowofNumber(int lastNumber) {
        for (int i = 1; i <=lastNumber ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size=scanner.nextInt();
        printTriagle(size);
    }
}
