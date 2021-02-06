import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x=Integer.parseInt(scanner.nextLine());
        int farmed=0;
        int counter=0;
        while(x>=100)
        {farmed+=x-26;
            counter++;
            x-=10;
        }
        if(farmed>=26)
        {farmed-=26;}

        System.out.println(counter);
        System.out.println(farmed);
    }
}
