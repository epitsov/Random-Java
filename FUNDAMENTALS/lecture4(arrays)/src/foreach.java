import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int [] numbers={1,2,34,5};
       // for (int i = 0; i <numbers.length ; i++) {
         //   int number=numbers[i];
        //    System.out.println(number);
    //    } both are the same
        for(int number:numbers)
        {
            System.out.println(numbers);
        }
    }
}
