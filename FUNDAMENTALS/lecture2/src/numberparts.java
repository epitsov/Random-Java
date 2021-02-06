import java.util.Scanner;

public class numberparts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int digits = number;
        //if(digits==0)
        //{
        //System.out.println("0");
        //  }
        //while(digits>0)
        // {
        //System.out.println(digits%10);
        //digits=digits/10;


        // }
        do {
            System.out.println(digits % 10);
            digits = digits / 10;
        }
        while (digits > 0);
    }
}
