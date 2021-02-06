import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, -2, -4, 10, 42, 39, -1));
        //List<Integer> positive = new ArrayList<>();
        int i = 0;

        while (i < numbers.size()) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);}
            else{
                    i++;
                }
            }
            for (Integer x : numbers) {
                System.out.print(x + " ");
            }
            //for (Integer x : number) {
            //if(x>=0)
            //{positive.add(x);}}
            //number=positive;
            //for (Integer x : number) {
            //System.out.print(x+" ");
            //}

        }
    }
