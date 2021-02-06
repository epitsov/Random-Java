import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String x="s3cr3t!P@ssw0rd";
        String z=scanner.nextLine();
        if(z.equals(x)){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong password!");
        }

    }
}
