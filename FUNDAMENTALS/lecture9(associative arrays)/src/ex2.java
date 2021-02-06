import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, Integer>resources=new LinkedHashMap<>();
        String input=scanner.nextLine();
        while (!"stop".equals(input))
        {int quantity=Integer.parseInt(scanner.nextLine());
        if(!resources.containsKey(input))
        {resources.put(input,quantity);}
        else{
            resources.put(input,resources.get(input)+quantity);
        }

            input=scanner.nextLine();
        }
        resources.forEach((key,value)-> System.out.println(key+" -> "+value));

    }
}
