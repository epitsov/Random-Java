import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int amountofBisc=Integer.parseInt(scanner.nextLine());
        int numofWorkers=Integer.parseInt(scanner.nextLine());
        int otherFactory=Integer.parseInt(scanner.nextLine());
        int biscuitsmade=0;

        for (int day = 1; day <= 30; day++) {
            if(day%3==0)
            {int leapb=(int)Math.floor(0.75*amountofBisc*numofWorkers);
                biscuitsmade+=leapb;
            }
            else {biscuitsmade+=(numofWorkers*amountofBisc);}

        }
        System.out.printf("You have produced %d biscuits for the past month.",biscuitsmade);
        System.out.println();
        if(biscuitsmade>otherFactory)
        {
            double percent= (double) 100*(biscuitsmade-otherFactory)/otherFactory;
            System.out.printf("You produce %.2f percent more biscuits.",percent);
        }
        else
            {double percent= (double) -100*(biscuitsmade-otherFactory)/otherFactory;
            System.out.printf("You produce %.2f percent less biscuits.",percent);

    }
}}
