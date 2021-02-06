import java.util.Scanner;

public class towninfo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String town=scanner.nextLine();
        int population= scanner.nextInt();
        int area=scanner.nextInt();
        System.out.printf("Town %s has population of %d and are of %d km.",town,population,area);
    }
}
