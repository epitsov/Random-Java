import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String[] inputRobots = scanner.nextLine().split( ";" );
        Map<String, Integer> robots = splitRobotsIntoLinkedHashmap( inputRobots );
        String inputTime = scanner.nextLine();
        if (inputTime.length() == 7) {
            inputTime = "0" + inputTime;
        }
        LocalTime time = LocalTime.parse( inputTime );
        int[] processTimes = new int[robots.size()];

        ArrayDeque<String> products = new ArrayDeque<>();
        String line = scanner.nextLine();
        while (!line.equals( "End" )) {

            products.add( line );
            line = scanner.nextLine();
        }
        while (!products.isEmpty()) {
            time = time.plusSeconds( 1 );
            String current = products.poll();
            decreaseTime( processTimes );

            if (!assignJob( robots, processTimes, current, time )) {
                products.offer( current );
            }
        }


    }

    private static void decreaseTime(int[] processTimes) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i] > 0) {
                --processTimes[i];
            }
        }
    }

    private static boolean assignJob(Map<String, Integer> robots, int[] processTimes, String current, LocalTime totalSeconds) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i] == 0) {
                int count = 0;
                for (Map.Entry<String, Integer> entry : robots.entrySet()) {
                    if (count == i) {
                        processTimes[i] = entry.getValue();
                        logJobAssigned( entry.getKey(), current, totalSeconds );
                        return true;
                    }
                    count++;
                }
            }
        }
        return false;
    }

    private static void logJobAssigned(String key, String name, LocalTime time) {
        String format = time.format( DateTimeFormatter.ofPattern( "HH:mm:ss" ) );
        System.out.println( String.format( "%s - %s %s", key, name, format ) );
    }

    private static Map<String, Integer> splitRobotsIntoLinkedHashmap(String[] inputRobots) {
        Map<String, Integer> robots = new LinkedHashMap<>();
        for (int i = 0; i < inputRobots.length; i++) {
            String line = inputRobots[i];
            int index = line.indexOf( "-" );
            String name = inputRobots[i].substring( 0, index );
            int time = Integer.parseInt( inputRobots[i].substring( index + 1 ) );
            robots.put( name, time );
        }
        return robots;
    }
}
