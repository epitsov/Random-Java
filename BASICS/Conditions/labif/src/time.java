import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        if(x<23)
        if (y<60) {
            int z = y + 15;
            if (z < 60){
                System.out.println(x + ":" + z);}

            else
            {int u=x+1;
            int z1=0+(z-60);
            if (z1<10)
            System.out.println(u + ":0" + z1);
            else
                System.out.println(u + ":" + z1);}
        }
        if(x>=23)
            if (y<60)
            {
                int z = y + 15;
                if (z < 60){
                    System.out.println(x + ":" + z);}

                else
                {int u=0;
                    int z1=0+(z-60);
                    if (z1<10)
                        System.out.println(u + ":0" + z1);
                    else
                        System.out.println(u + ":" + z1);};}
            }

    }
