import java.util.Scanner;

public class greaterVal {
    static void str(String input1,String input2) {
        if (input1.length() > input2.length()) {
            System.out.println(input1);
        } else {
            System.out.println(input2);
        }

    }
    static void chars(char input1,char input2) {
        if (input1>input2)
        {
            System.out.println(input1);
        }
        else
        {
            System.out.println(input2);
        }

    }
    static void intg(int input1,int input2) {
        if (input1 > input2) {
            System.out.println(input1);
        } else {
            System.out.println(input2);
        }

    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String x=scanner.nextLine();
        if(x.equals("int"))
        {int x1=scanner.nextInt();
        int x2= scanner.nextInt();
        intg(x1,x2);}
        else if(x.equals("string"))
        {String x1=scanner.nextLine();
        String x2= scanner.nextLine();
            str(x1,x2);}
        else
        {char x1=scanner.nextLine().charAt(0);
            char x2=scanner.nextLine().charAt(0);
            chars(x1,x2);}

    }
}

