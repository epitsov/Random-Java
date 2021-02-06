import java.util.Scanner;

public class pool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double v= Double.parseDouble(scanner.nextLine());
        Double p1= Double.parseDouble(scanner.nextLine());
        Double p2= Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double liters=p1*h+p2*h;
        if(v>liters) {
            System.out.printf("The pool is %.2f" +"% full. " +
                    "Pipe 1: %.2f  "+" %" +
                    " Pipe 2: %.2f  "+" %.",
                    (1-((v-liters)/v))*100,
                    ((p1*h)/liters)*100,
                    ((p2*h)/liters)*100);
        }
        }
    }

