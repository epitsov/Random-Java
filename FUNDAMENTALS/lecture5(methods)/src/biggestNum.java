import java.util.Scanner;

public class biggestNum {
    static int getMax(int a,int b)
    {if(a>b)
    {return a;
    }
    return b;}
    static int maxof3 (int a, int b, int c)
    {return getMax(getMax(a,b),c);}
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x= getMax(3,5);
        System.out.println(x);
    }
}
