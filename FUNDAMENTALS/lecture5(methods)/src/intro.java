import java.util.Scanner;

public class intro {
    static void print(int lenght, char symbol){

        for (int i = 0; i <lenght ; i++) {

        System.out.print(symbol);}

    }
    static void print(int lenght)
    {print(lenght,'*');}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int boarderlenght=scanner.nextInt();
        char symbol=scanner.next().charAt(0);
        print(boarderlenght);
        print(boarderlenght,symbol);



    }
}
