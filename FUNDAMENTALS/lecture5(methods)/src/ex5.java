import java.util.Scanner;

public class ex5 {
    static void middlechar(String input)
    {int lenght=input.length();
    if(lenght%2==0)
    {  int upper=(int)Math.ceil(((lenght-1)/2)+1);
        int down=(int)Math.floor((lenght-1)/2);
        System.out.println(input.charAt(down)+""+input.charAt(upper));

    }
    else{
        System.out.println(input.charAt(lenght/2));
    }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        middlechar(input);
    }
}
