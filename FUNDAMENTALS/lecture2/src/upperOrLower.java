import java.util.Scanner;

public class upperOrLower {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char x=scanner.nextLine().charAt(0);
        if(x>='A'&&x<='Z')
        {

            System.out.println("upper-case");}
        if(x>='a'&&x<='z')
        {
            System.out.println("lower-case");}
    }
}
