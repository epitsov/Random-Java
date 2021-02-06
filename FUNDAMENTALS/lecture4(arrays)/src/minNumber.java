import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int [] numbers= {1, 2 ,3, 4};
        int min=numbers[0];
        for(int number:numbers)
        {if(number<min)
        min=number;}
    }
}
