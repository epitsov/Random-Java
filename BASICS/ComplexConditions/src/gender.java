import java.util.Scanner;

public class gender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        char genderLetter=gender.charAt(0);

        if (age >= 16) {
            if (gender.equals("f")) {
                System.out.println("Ms.");
            } else {
                System.out.println("Mr.");
            }
        } else {
            if (gender.equals("f")) {
                System.out.println("Miss");
            } else {
                System.out.println("Master");
            }
        }
    }
}