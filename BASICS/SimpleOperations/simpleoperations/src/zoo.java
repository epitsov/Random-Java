import java.util.Scanner;

public class zoo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int dogs= Integer.parseInt(scanner.nextLine());
        int others= Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f lv.",2.5*dogs+4*others);

    }
}
