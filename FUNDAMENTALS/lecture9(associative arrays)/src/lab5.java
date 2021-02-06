import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer>sorted= Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt).sorted((n1,n2)->n2.compareTo(n1))
                .collect(Collectors.toList());
        for (int i = 0; i <3 ; i++) {
            if(i<2){
            System.out.print(sorted.get(i)+" ");}
            else
            {System.out.print(sorted.get(i));}
        }

    }
}
