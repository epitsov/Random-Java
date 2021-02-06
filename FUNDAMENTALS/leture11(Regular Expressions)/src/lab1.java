import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pattern regex = Pattern.compile("\\b(([A-Z][a-z]+) [A-Z][a-z]+)\\b");
        Matcher matcher = regex.matcher(scanner.nextLine());
        while(matcher.find())
        {
            System.out.print(matcher.group()+" ");
        }

        }
    }

