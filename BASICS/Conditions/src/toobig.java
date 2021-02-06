import java.util.Scanner;

public class toobig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String output;
        if (a == 1) {
            output="one";
        } else if (a == 2) {
            output="two";
        } else if (a == 3) {
            output="three";
        } else if (a == 4) {
            output="four";
        } else if (a == 5) {
            output="five";
        } else if (a == 6) {
            output="six";
        } else if (a == 7) {
            output="seven";
        } else if (a == 8) {
            output="two";
        } else if (a == 9) {
            output="eight";
        } else {
            output="toobig";
        }
        System.out.println(output);
    }
}