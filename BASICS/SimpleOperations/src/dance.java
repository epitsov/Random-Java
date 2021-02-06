import java.util.Scanner;

public class dance
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double lenght= Double.parseDouble(scanner.nextLine());
        double width= Double.parseDouble(scanner.nextLine());
        double lenghta= Double.parseDouble(scanner.nextLine());
        double q=(lenght*100)*(width*100)-
                (lenghta*100)*(lenghta*100)-
                ((lenght*100)*(width*100))/10;
        double people=Math.floor(q/7040);
        System.out.printf("%.0f",people);
    }
}
