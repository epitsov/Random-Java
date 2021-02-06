import java.util.Scanner;

public class mulyiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int z = x.length() - 1;
        char numberatz1 = x.charAt(z);
        int numberatz = Integer.parseInt("" + numberatz1);
        int y = x.length() - 2;
        char numberaty1 = x.charAt(y);
        int numberaty = Integer.parseInt("" + numberaty1);
        int u = x.length() - 3;
        char numberatu1 = x.charAt(u);
        int numberatu = Integer.parseInt("" + numberatu1);
        int sum = 0;
        for (int i = 1; i <= numberatz; i++) {
            {
                for (int o = 1; o <= numberaty; o++) {
                    for (int p1 =1 ; p1 <= numberatu; p1++) {
                        sum = i * o * p1;
                        System.out.println(i + " * " + o + " * " + p1 + " = " + sum+";");
                    }

                }
            }
        }

    }
}