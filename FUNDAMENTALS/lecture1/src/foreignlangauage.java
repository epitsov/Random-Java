import java.util.Scanner;

public class foreignlangauage {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String counter= scanner.nextLine();
        if(counter.equals("USA")||counter.equals("England"))
        {
            System.out.println("English");

        }
        else if(counter.equals("Spain")||counter.equals("Argentina")||counter.equals("Mexico"))
        {
            System.out.println("Spanish");
        }
        else
        {
            System.out.println("unknown");
        }
    }
}
