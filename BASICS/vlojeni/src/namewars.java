import java.util.Scanner;

public class namewars {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int max= Integer.MIN_VALUE;
        String name=scanner.nextLine();
        String winner="";
        while(!name.equals("STOP")) {
        int number=0;
        for(int i=0; i<name.length();i++)
        {number+=name.charAt(i);}
            if (number>max)
        {max=number;
        winner=name;}
        name= scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d!",winner,max);
        }

    }

