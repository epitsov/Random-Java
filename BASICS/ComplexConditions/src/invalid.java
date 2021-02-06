import java.util.Scanner;

public class invalid {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= Integer.parseInt(scanner.nextLine());
        boolean isvalid= (number>100) && (number<200) || (number==0);
        if(isvalid)
        {
            System.out.println();
    }
        else
        {
            System.out.println("invalid");}

}}
