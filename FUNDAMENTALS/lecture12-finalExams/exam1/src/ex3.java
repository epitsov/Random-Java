import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class ex3 {
    static Map<String, Integer> personHealth=new HashMap<>(  );
    static Map<String, Integer> personEnergy=new HashMap<>(  );

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String command = scanner.nextLine();
        while (!command.equals( "Results" )) {

            String[] commandParts = command.split( ":" );
            String commandType = commandParts[0];
            switch (commandType) {
                case "Add":
                    add( commandParts[1], Integer.parseInt( commandParts[2] ), Integer.parseInt( commandParts[3] ) );
                    break;
                case "Attack":
                    attack( commandParts[1], commandParts[2], Integer.parseInt( commandParts[3] ) );

                    break;
                case "Delete":

                    delete( commandParts[1] );

                    break;

            }

            command = scanner.nextLine();
        }
        List<String> names = personHealth.entrySet().stream()
                .sorted( (entryA, entryB) ->
                {
                    int healthA = entryA.getValue();
                    int healthB = entryB.getValue();
                    String nameA = entryA.getKey();
                    String nameB = entryB.getKey();
                    if (healthA != healthB) {
                        return Integer.compare( healthB, healthA );
                    } else {
                        return nameA.compareTo( nameB );
                    }
                } )
                .map( entry -> entry.getKey() )
                .collect( Collectors.toList() );
        System.out.printf("People count: %d%n",names.size());
        for (String name : names) {
            System.out.printf( "%s - %d - %d%n", name, personHealth.get( name ), personEnergy.get( name ) );
        }

    }

    private static void delete(String id) {
        if (id.equals( "All" )) {
            personEnergy.clear();
            personHealth.clear();
        } else {
            disqualify( id, false );
        }

    }

    private static void attack(String attacker, String defender, int damage) {
        Integer defenderHealth = personHealth.get( defender );
        Integer attackerEnergy = personEnergy.get( attacker );
        if (defenderHealth != null && attackerEnergy != null) {
            defenderHealth -= damage;
            if (defenderHealth <= 0) {
                disqualify( defender, true );
            } else {
                personHealth.put( defender, defenderHealth );
            }

            attackerEnergy--;
            if (attackerEnergy == 0) {
                disqualify( attacker, true );
            } else {
                personEnergy.put( attacker, attackerEnergy );
            }
        }
    }

    private static void disqualify(String id, boolean showMessage) {
        personHealth.remove( id );
        personEnergy.remove( id );
        if (showMessage) {
            System.out.printf( "%s was disqualified!%n", id );
        }
    }

    private static void add(String name, int health, int energy) {
        Integer currenthealth = personHealth.get( name );
        if (currenthealth == null) {
            personHealth.put( name, health );
            personEnergy.put( name, energy );
        } else {
            personHealth.put( name, currenthealth + health );
        }
    }
}

