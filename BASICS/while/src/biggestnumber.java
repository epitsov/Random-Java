import java.util.Scanner;

public class biggestnumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        int maxNumber=Integer.MIN_VALUE;
        while(n>0)
        {int number= Integer.parseInt(scanner.nextLine());
        if(number>maxNumber){
        maxNumber=number;}


        n--;}
        System.out.println(maxNumber);
    }
}
