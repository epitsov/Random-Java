import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class insertLists {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String [] parts=scanner.nextLine().split("\\s+");
        List<Integer> number=new ArrayList<>();
        for (int i = 0; i < parts.length; i++) {
            number.add(Integer.parseInt(parts[i]));
        }
        for (int num:number             ) {
            System.out.print(num+" ");
        }
    }
}
