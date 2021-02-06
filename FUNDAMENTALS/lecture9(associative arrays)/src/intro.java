import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ;
       Map<String,Integer> digitsByName=new HashMap<>();
       digitsByName.put("zero",0);
       digitsByName.put("one",1);
       digitsByName.put("two",2);
       digitsByName.put("three",3);
       Integer value =digitsByName.get("four");
       if(value!=null)
       {
           System.out.println("exists");
       }
        for (Map.Entry<String, Integer> entry : digitsByName.entrySet()) {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        for (String key : digitsByName.keySet()) {
            System.out.println(key);
        }
        for (Integer valuev : digitsByName.values()) {
            System.out.println(valuev);
        }

        String name = scanner.nextLine();
        digitsByName.get(name);
        System.out.println(name);
    }
}
