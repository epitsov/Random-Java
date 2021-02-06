import java.util.Scanner;

public class swinm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timemeter = Double.parseDouble(scanner.nextLine());
        double time = timemeter * distance;
        double delay = Math.floor(distance / 15) * 12.5;
        double totaltime = time + delay;
        if (totaltime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totaltime);
        }else{
                System.out.printf("No, he failed! He was %.2f seconds slower."
                        ,  totaltime-record);
            }
        }
    }
