import java.util.Scanner;

public class passwortgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        String stringatL = l + "";
        char u = stringatL.charAt(0);
        for (int i = 1; i < n; i++) {
            for (int b = 1; b < n; b++) {
                for (char a = 97; a < 97 + l; a++) {
                    for (char c = 97; c < 97 + l; c++) {
                        if (i > b) {
                            for (int p = 1 + i; p <= n; p++) {
                                System.out.print(i + "" + b + "" + a + "" + c + "" + p + " ");
                            }
                        } else {
                            for (int q = 1 + b; q <= n; q++) {
                                System.out.print(i + "" + b + "" + a + "" + c + "" + q + " ");

                            }
                        }
                    }
                }
            }
        }
    }
}
