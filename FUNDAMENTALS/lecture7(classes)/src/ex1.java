import java.util.Random;
import java.util.Scanner;

public class ex1 {
    //•	Authors – {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"}
    //•	Cities – {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"}
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] phases = new String[]{"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] Events = new String[]{"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] Authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] Cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random random= new Random();
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {

            String phase = phases[random.nextInt(phases.length)];
            String event = Events[random.nextInt(Events.length)];
            String authors= Authors[random.nextInt(Authors.length)];
            String cities= Authors[random.nextInt(Cities.length)];
            String result= String.format("%s %s %s - %s",phase,event,authors,cities);
            System.out.println(result);
        }

    }
}
