import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] numberString=scanner.nextLine().split(" ");
        double[] numbers=new double[numberString.length];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=Integer.parseInt(numberString[i]);
        }
        Map<Double,Integer>numberCounts=new TreeMap<>();
        for (double number : numbers) {

            if (numberCounts.containsKey(number))
            {Integer currentcount=numberCounts.get(number);
            numberCounts.put(number,1+currentcount);}
            else
            {numberCounts.put(number,1);}
        }
        for (Map.Entry<Double, Integer> entry : numberCounts.entrySet()) {
            System.out.printf("%.0f -> %d\n",entry.getKey(),entry.getValue());
        }


    }
}
