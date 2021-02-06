import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pattern regex= Pattern.compile("\\b(?<day>[\\d]{2})([.\\/-])(?<month>[A-Z][a-z]+)(\\2)(?<year>[\\d]{4})\\b");
        Matcher matcher=regex.matcher(scanner.nextLine());
        while (matcher.find())
        {String day=matcher.group("day");
        String month=matcher.group("month");
        String year=matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year:%s%n",day,month,year);}

    }
}
