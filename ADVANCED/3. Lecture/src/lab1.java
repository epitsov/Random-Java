import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String nextLine = scanner.nextLine();
        Set<String> parking = new LinkedHashSet<>();
        while (!"END".equals( nextLine )) {
            String[] split = nextLine.split( ", " );
            if ("IN".equals( split[0] )) {
                parking.add( split[1] );
            } else if ("OUT".equals( split[0] )) {
                parking.remove( split[1] );
            }
            nextLine=scanner.nextLine();

        }
        for (String s : parking) {
            System.out.println(s);
        }
        if(parking.isEmpty())
        {
            System.out.println("Parking Lot is Empty");
        }

    }
}
