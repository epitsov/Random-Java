import java.util.Scanner;

public class tickets {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double n=Double.parseDouble(scanner.nextLine());
        double counterwindow=0;
        double countermiddle=0;
        double counteraisle=0;
        for (int i=0;i<n;i++)
        {String input=scanner.nextLine();
        if(input.charAt(1)=='A'||input.charAt(1)=='F')
        {counterwindow++;}
        else if(input.charAt(1)=='B'||input.charAt(1)=='E')
        {countermiddle++;}
        else{counteraisle++;}}
        double percentwindow=counterwindow/n;
        double perceintmiddle=countermiddle/n;
        double percentaisle=counteraisle/n;
        System.out.printf("Window Seats:%.2f %%\n",100*percentwindow);
        System.out.printf("Middle Seats:%.2f %%\n",100*perceintmiddle);
        System.out.printf("Aisle Seats:%.2f %%",100*percentaisle);


    }
}
