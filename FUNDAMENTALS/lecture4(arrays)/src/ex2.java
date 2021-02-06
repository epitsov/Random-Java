import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input1=scanner.nextLine();
        String input2=scanner.nextLine();
        String x[]=input1.split(" ");
        String x2[]=input2.split(" ");
        for (int i = 0; i < x2.length; i++) {
            for (int j = 0; j <x.length; j++) {
            if(x2[i].equals(x[j]))
            {
                System.out.print(x2[i]+" ");
            }
        }}
    }
}
