import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] userNames=scanner.nextLine().split(", ");
        List<String> validWords=new ArrayList<>();
        for (String word : userNames) {
            if(isValid(word))
            {
                System.out.println(word);
            }
        }

    }

    private static boolean isValid(String word) {
        if(word.length()<3||word.length()>16)
        {return false;}
        for (int i = 0; i <word.length() ; i++) {
        if(!Character.isLetterOrDigit(word.charAt(i))&&word.charAt(i)!='_'&&word.charAt(i)!='-')
        {return false;}}
        return true;
    }

}
