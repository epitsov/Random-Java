import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String line = scanner.nextLine();
        Map<String, List<String>> guestList = new TreeMap<>();
        int unliked = 0;
        while (!"Stop".equals( line )) {
            String[] tokens = line.split( "-" );
            String command = tokens[0];
            String guest = tokens[1];
            String meal = tokens[2];
            switch (command) {
                case "Like":
                    if (!guestList.containsKey( guest )) {
                        guestList.put( guest, new ArrayList<>() );
                        guestList.get( guest ).add( meal );
                    } else {
                        if (!guestList.get( guest ).contains( meal )) {
                            guestList.get( guest ).add( meal );
                        }
                    }
                    break;
                case "Unlike":
                    if (guestList.containsKey( guest )) {
                        if (guestList.get( guest ).contains( meal )) {
                            guestList.get( guest ).remove( meal );
                            unliked++;
                            System.out.println( String.format( "%s doesn't like the %s.", guest, meal ) );
                        } else {
                            System.out.println( String.format( "%s doesn't have the %s in his/her collection.", guest, meal ) );
                        }

                    } else {
                        System.out.println( String.format( "%s is not at the party.", guest ) );
                    }
                    break;
            }


            line = scanner.nextLine();

        }
        guestList.entrySet().stream()
                .sorted( (a, b) ->
                        {
                            return Integer.compare( b.getValue().size(), a.getValue().size() );
                        }
                ).forEach( entry -> {
            System.out.printf( "%s: ", entry.getKey() );
            System.out.print( String.join( ", ", entry.getValue() ) );
            System.out.println();
        } );
        System.out.println(String.format( "Unliked meals: %d",unliked ));
    }
}
