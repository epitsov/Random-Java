import java.util.Scanner;

public class ex4exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int lastpair = 0;
        int maxdiff=0;
        for (int i = 0; i < n; i++) {
            int input1 = Integer.parseInt(scanner.nextLine());
            int input2 = Integer.parseInt(scanner.nextLine());
            int currentpair = input1 + input2;
            if(i>0) {
                int difference = Math.abs(currentpair - lastpair);
                if(difference>maxdiff)
                {maxdiff=difference;}
            }


            lastpair=currentpair;
        }
        if(maxdiff==0)
        {
            System.out.printf("Yes, value=%d",lastpair);}
        else{
            System.out.printf("No, maxdiff=%d",maxdiff);
        }
    }}
