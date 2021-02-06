import java.util.Scanner;

public class digtalclock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = Integer.parseInt(scanner.nextLine());
        int appcount = Integer.parseInt(scanner.nextLine());
        int maxfloor = Integer.MIN_VALUE;
        while (floor > 0) {
            if (floor > maxfloor) {
                maxfloor = floor;
            }
            for (int i = 0; i < appcount; i++) {
                if (floor == maxfloor) {
                    System.out.printf("L"+ floor+ i+" ");
                    continue;
                }
                if (floor % 2 == 0) {
                    System.out.printf("O"+ floor+ i+" ");
                } else {
                    System.out.printf("A"+ floor+ i+" ");
                }


            }
            System.out.println();

            floor--;
        }
    }
}