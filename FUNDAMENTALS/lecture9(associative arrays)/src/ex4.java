import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Map<String, Double>orders=new LinkedHashMap<>();
        Map<String, Double>prices=new LinkedHashMap<>();
        String input=scanner.nextLine();
        while(!input.equals("buy"))
        {String []tokens=input.split(" ");
        String item=tokens[0];
        double price=Double.parseDouble(tokens[1]);
        int quantity=Integer.parseInt(tokens[2]);
        if(!orders.containsKey(item))
        {orders.put(item,quantity*price);
        prices.put(item,price);}
        else{
            if (prices.get(item)==price)
            {orders.put(item,quantity*price+orders.get(item));
                prices.put(item,price);}
            else {
                double oldQuantity=orders.get(item)/prices.get(item);
                orders.put(item,(quantity+oldQuantity)*price);
                prices.put(item,price);
            }
        }

            input=scanner.nextLine();
        }
        orders.entrySet().stream()
                .forEach(entry-> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));

    }
}
