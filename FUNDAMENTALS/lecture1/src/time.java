import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x= Integer.parseInt(scanner.nextLine());
        int y= Integer.parseInt(scanner.nextLine());
        y+=30;
        if (y>59)
        {x++;
        y-=60;}
        if (x>23)
        {x=0;}
        System.out.println(x+":"+y);

    }
}
