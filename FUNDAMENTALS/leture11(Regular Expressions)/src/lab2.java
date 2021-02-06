import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       // String regex="(\\+[359]+)([ -])([0-9]+)(\\2)([0-9]+)(\\2)([0-9]+)";
        String regex="\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String phones=scanner.nextLine();
        Pattern pattern=Pattern.compile(regex);
        Matcher phoneMather=pattern.matcher(phones);
        List<String>matchedPhones=new LinkedList<>();
        while (phoneMather.find())
        {
            matchedPhones.add(phoneMather.group());}
        System.out.println(String.join(", ",matchedPhones));
    }
}
