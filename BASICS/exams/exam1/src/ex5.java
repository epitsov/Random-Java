import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double highestvalue = Double.MIN_VALUE;
        double lowestvalue = Double.MAX_VALUE;
        double counter1 = 0;
        int counter = 0;
        String name = "";
        String name1 = "";
        for (int i = 0; i < n; i++) {
            String movie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            counter++;
            counter1 += rating;
            if (rating > highestvalue) {
                highestvalue = rating;
                name = movie;
            }
            if (rating < lowestvalue) {
                lowestvalue = rating;
                name1 = movie;
            }
        }
        double avarage=counter1/counter;
        System.out.println(name + " is with highest rating: " + highestvalue);
        System.out.println(name1 + " is with lowest rating: " + lowestvalue);
        System.out.printf("Average rating: %.1f",avarage);
    }
}
