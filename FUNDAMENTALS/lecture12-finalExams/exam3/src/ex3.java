import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String input = scanner.nextLine();
        Map<String, List<String>> heroes = new HashMap<>();
        while (!"End".equals( input )) {
            String[] tokens = input.split( "\\s+" );
            String command = tokens[0];
            String heroName = tokens[1];
            switch (command) {
                case "Enroll": {
                    if (!heroExists( heroName, heroes )) {
                        heroes.put( heroName, new ArrayList<>() );
                    } else {
                        System.out.println( String.format( "%s is already enrolled.", heroName ) );
                    }
                    break;
                }
                case "Learn": {
                    String spell = tokens[2];
                    if (heroExists( heroName, heroes )) {
                        if (heroes.get( heroName ).contains( spell )) {
                            System.out.println( String.format( "%s has already learnt %s.", heroName, spell ) );
                        } else {
                            heroes.get( heroName ).add( spell );
                        }
                    } else {
                        System.out.println( String.format( "%s doesn't exist.", heroName ) );
                    }
                    break;
                }
                case "Unlearn": {
                    String spell = tokens[2];
                    if (heroExists( heroName, heroes )) {
                        if (heroes.get( heroName ).contains( spell )) {
                            heroes.get( heroName ).remove( spell );
                        } else {
                            System.out.println( String.format( "%s doesn't know %s.", heroName, spell ) );

                        }
                    } else {
                        System.out.println( String.format( "%s doesn't exist.", heroName ) );
                    }
                    break;
                }
            }

            input = scanner.nextLine();
        }
        System.out.println( "Heroes:" );
        heroes.entrySet().stream()
                .sorted( (a, b) ->
                        {
                            int sizeA = a.getValue().size();
                            int sizeB = b.getValue().size();
                            String nameA = a.getKey();
                            String nameB = b.getKey();
                            if (sizeA != sizeB) {
                                return Integer.compare( sizeA, sizeB );
                            } else {
                                return nameA.compareTo( nameB );
                            }
                        }
                ).forEach( entry -> {
            System.out.printf( "== %s: ", entry.getKey() );
            System.out.printf( String.join( ", ", entry.getValue() ) );
            System.out.println();
        } );
    }

    private static boolean heroExists(String command, Map<String, List<String>> heroes) {
        if (heroes.containsKey( command )) {
            return true;
        }
        return false;
    }
}
