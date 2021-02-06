import java.util.Scanner;

public class cinematickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int totaltickets = 0;
        int studentticket = 0;
        int standardticket = 0;
        int kidticket = 0;
        while (!movie.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            int totalseats = seats;
            String tickettype = scanner.nextLine();
            while (!tickettype.equals("End")) {
                if (tickettype.equals("student")) {
                    studentticket++;
                } else if (tickettype.equals("standard")) {
                    standardticket++;
                } else {
                    kidticket++;
                }
                seats--;
                totaltickets++;
                if (seats == 0) {
                    break;
                }
                tickettype = scanner.nextLine();
            }

            double percent = ((totalseats - seats) * 1.00 / totalseats) * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percent);
            movie = scanner.nextLine();
        }
        System.out.println("Total tickets: " + totaltickets);
        double student = 100-((totaltickets - studentticket) * 1.0 / totaltickets) * 100;
        double standard =100- ((totaltickets - standardticket) * 1.0 / totaltickets) * 100;
        double kids = 100-((totaltickets - kidticket) * 1.0 / totaltickets) * 100;
        System.out.printf("%.2f%% student tickets.%n", student);
        System.out.printf("%.2f%% standard tickets.%n", standard);
        System.out.printf("%.2f%% kids tickets.%n", kids);
    }
}
