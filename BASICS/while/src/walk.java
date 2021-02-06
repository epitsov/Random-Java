import java.util.Scanner;

public class walk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numsteps = 0;
        boolean goalreached = true;
        while (numsteps <= 10000) {
            String x = scanner.nextLine();
            if (x.equals("Going home")) {
                int newsteps = Integer.parseInt(scanner.nextLine());
                numsteps += newsteps;
                if (10000 - numsteps > 0) {
                    goalreached = false;
                    break;


                } else {

                    goalreached = true;
                    break;
                }
            } else {
                int z = Integer.parseInt(x);
                numsteps += z;
                goalreached = true;
            }
        }
        if (goalreached) {
            System.out.println("Goal reached! Good job!");
        }
        else{
            int d=10000-numsteps;
            System.out.printf("%d more steps to reach goal.",d);
    }

}}


