import java.util.Scanner;

public class smtoinch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double sm= Double.parseDouble(scanner.nextLine());
        double inche= sm*2.54;
        System.out.println(inche);

    }
}
