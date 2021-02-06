import java.util.Arrays;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] input=Arrays.stream(scanner.nextLine().split(" "))
                .filter(x->x.length()%2==0).toArray(String[]::new);
        for (String s : input) {
            System.out.println(s);
        }

    }
}
