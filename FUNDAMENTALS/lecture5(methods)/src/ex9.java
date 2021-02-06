import java.util.Scanner;

public class ex9 {
    static void palindrome(String x) {
        String newarray = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            newarray += x.charAt(i);
        }
        int x1 = Integer.parseInt(newarray);
        int x2 = Integer.parseInt(x);
        if (x1 == x2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String x = scanner.nextLine();
            if (x.equals("END")) {
                break;
            }
            palindrome(x);

        }
    }
}
