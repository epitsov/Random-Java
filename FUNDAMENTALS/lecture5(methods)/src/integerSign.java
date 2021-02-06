import java.util.Scanner;

public class integerSign {
    static void numSign(int x)
    {if(x>0)
        System.out.printf("The number %d is positive.",x);
    else if(x<0)
    {        System.out.printf("The number %d is negative.",x);
    }
    else{
        System.out.printf("The number %d is zero.",x);

    }}
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int input=scanner.nextInt();
        numSign(input);
    }
}
