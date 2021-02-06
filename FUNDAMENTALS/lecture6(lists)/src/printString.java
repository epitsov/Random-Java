import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class printString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> words= new ArrayList<>(Arrays.asList("the","quick","brown","fox"));
        String joined=String.join(",",words);
        System.out.println(joined);
    }
}
