import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int lenght=Integer.parseInt(scanner.nextLine());
        List<String> products=new ArrayList<>();
        for (int i = 0; i <lenght ; i++) {
            String currentprod=scanner.nextLine();
            products.add(currentprod);
        }
        Collections.sort(products);
        for (int i = 0; i <products.size() ; i++) {
            System.out.printf("%d. %s%n",i+1,products.get(i));
        }
    }
}
