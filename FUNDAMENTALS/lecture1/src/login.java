import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        int y = input2.length();
        String x2 = "";
        int counter = 1;
        for (int z = y - 1; z >= 0; z--) {
            char zv = input2.charAt(z);
            x2 += zv;
        }
        if (input.equals(x2)) {
            System.out.println("User logged in.");
        }

        while (!input.equals(x2)) {
            x2 = "";
            System.out.println("Incorrect password. Try again.");
            input2 = scanner.nextLine();
            y = input2.length();
            for (int z = y - 1; z >= 0; z--) {
                char zv = input2.charAt(z);
                x2 += zv;
            }
            if(x2.equals(input))
            {break;}
            counter++;

            if (counter >= 4){
                break;}

        }
        if (counter >= 4) {
            System.out.printf("User %s blocked!", input);
        } else {
            System.out.printf("User %s logged in.", input);
        }
    }
}
