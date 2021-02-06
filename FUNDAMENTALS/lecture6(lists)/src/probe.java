import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class probe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> inputnumbers = new ArrayList<>(Arrays.asList(1,-10,15,13));
        inputnumbers.set(2,42);
        for(int inputnumber:inputnumbers)
        {
            System.out.println(inputnumber);
        }
        for (int i = 0; i <inputnumbers.size() ; i++) {
            System.out.println(inputnumbers.get(i));
        }
    }
}
