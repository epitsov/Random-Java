import java.util.Scanner;

public class speedinfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());

        if (x <= 10) {
            System.out.println("slow");
        } else if (x <= 50) {
            System.out.println("avarage");
        } else if (x <= 150) {
            System.out.println("fast");
        } else if (x <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
