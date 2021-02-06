import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    int Npeople=scanner.nextInt();
    int capacity=scanner.nextInt();
    int counter=0;
    while(Npeople>0)
    {

    if(Npeople<capacity)
    {counter++;
    break;
    }Npeople-=capacity;
        counter++;

    }
        System.out.println(counter);
    }
}
