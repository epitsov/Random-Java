import java.util.Scanner;

public class fruitorvegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //fruit" са banana, apple, kiwi, cherry, lemon и grapes
        //•	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
        //•	Всички останали са "unknown"
        boolean isFruit=input.equals("banana") || input.equals("apple") ||
                input.equals("kiwi") || input.equals("cherry") ||
                input.equals("lemon") || input.equals("grapes");
        boolean isVegetable=input.equals("tomato") || input.equals("cucumber") ||
                input.equals("pepper") || input.equals("carrot");

        if (isFruit) {
            System.out.println("fruit");
        } else if (isVegetable){
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
