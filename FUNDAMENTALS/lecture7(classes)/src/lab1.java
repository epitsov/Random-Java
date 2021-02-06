import java.util.Random;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] input=scanner.nextLine().split(" ");
        Random rnd=new Random();
        for (int i = 0; i <input.length ; i++) {
            String x1=" ";
            int pos2=rnd.nextInt(input.length);
            x1=input[i];
            input[i]=input[pos2];
            input[pos2]=x1;
        }
        System.out.println(String.join(System.lineSeparator(),input));
    }
}
