import java.util.Scanner;

public class ex1TOex4 {
    static int smallest(int x1, int x2) {
        if (x1 < x2) {
            return x1;
        }
        return x2;
    }

    static int smallestof3(int x1, int x2, int x3) {//1. exercise
        int smallestNum = smallest(smallest(x1, x2), x3);
        return smallestNum;
    }

    static void charcount(char x1, char x2) {//3. exercise
        String output = "";
        if (x2 < x1) {
            char firstoldvlalue = x1;
            x1 = x2;
            x2 = firstoldvlalue;
        }
        for (char i = (char) (x1 + 1); i < x2; i++) {
            output += i + " ";
        }
        System.out.println(output);
    }

    static boolean charCount(String input) {
        int x1 = 0;
        boolean x2 = false;
        for (int i = 0; i < input.length(); i++) {
            x1++;
        }
        if (x1 < 6 || x1 > 10) {
            return x2;
        }
        return true;
    }

    static boolean letterAndDigits(String input) {
        int x1 = 0;
        boolean x3 = false;
        for (int i = 0; i < input.length(); i++) {
            char charaty = input.charAt(i);
            if ((charaty < 48 || charaty > 90) && (charaty < 97 || charaty > 122)) {
                x1++;
            }
        }
        if (x1 > 0) {
            return x3;
        }
        return true;
    }

    static boolean digitCount(String input) {
        int x1 = 0;
        boolean x = false;
        for (int i = 0; i < input.length(); i++) {
            char charaty = input.charAt(i);

            if (charaty >= 48 && charaty <= 57) {
                x1++;
            }
        }
        if (x1 <= 2) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int truecount = 0;

        if (letterAndDigits(input) == false) {
            System.out.println("Password must consist only of letters and digits");
        } else {
            truecount++;
        }

        if (charCount(input) == false) {
            System.out.println("Password must be between 6 and 10 characters");
        } else {
            truecount++;
        }
        if (digitCount(input) == false) {
            System.out.println("Password must have at least 2 digits");

        } else {
            truecount++;
        }
if(truecount==3)
{
    System.out.println("Password is valid");
}
    }
}
