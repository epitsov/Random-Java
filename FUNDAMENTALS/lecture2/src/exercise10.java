import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int y=scanner.nextInt();
        int targetAchived=0;
        double x=n/2.0;
        while(n>=m)
        {            n-=m;

            if(n==x&&y>0)

        {n/=y;
      }
            targetAchived++;
        }
        System.out.println(n);
        System.out.println(targetAchived);
    }
}