import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        int i= scanner.nextInt();
        int sum= ((x+y)/z)*i;
        System.out.println(sum);
    }
}
