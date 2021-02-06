import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String [] parts= scanner.nextLine().split("\\s+");
        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i <parts.length ; i++) {
            numbers.add(Double.parseDouble(parts[i]));
        }
        int i = 0;

        while (i < numbers.size()-1) {
            if(numbers.get(i).equals(numbers.get(i+1)))
            {double sum=numbers.get(i)+numbers.get(i+1);
            numbers.set(i,sum);
            numbers.remove(i+1);
            i=0;}
            else{i++;}
        }
        for (Double x : numbers) {
            System.out.printf("%.1f ",x);
        }
    }
}
