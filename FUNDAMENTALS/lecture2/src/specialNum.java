import javax.print.DocFlavor;
import java.util.Scanner;

public class specialNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        int lenght = 0;
        char charatJ;
        String iStr = "";
        String xStr = "";
        int z = 0;
        for (int i = 1; i <= x; i++) {
            iStr += i;
            lenght = iStr.length();
            for (int j = 0; j < lenght; j++) {
                charatJ = iStr.charAt(j);
                xStr += charatJ;
                z = Integer.parseInt(xStr);
                sum += z;
                xStr="";
            }
            if (sum == 7 || sum == 5 || sum == 11) {
                System.out.printf("%d -> True \n", i);
            } else {
                System.out.printf("%d -> False \n", i);
            }
            sum = 0;
            lenght = 0;
            z=0;
            iStr = "";

        }
    }
}
