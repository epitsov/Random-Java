import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String input = scanner.nextLine();
        Map<String, Trainer> trainers = new HashMap<>();
        while (!input.equals( "Tournament" )) {
            String[] tokens = input.split( "\\s+" );
            String name = tokens[0];
            String pokemon = tokens[1];
            String elem = tokens[2];
            int health = Integer.parseInt( tokens[3] );
            Pokemon pokemon1 = new Pokemon( pokemon, elem, health );
            trainers.putIfAbsent( name, new Trainer() );
            trainers.get( name ).addToList( pokemon1 );
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals( "End" )) {
            for (Map.Entry<String, Trainer> entry : trainers.entrySet()) {
                List<Pokemon> list = entry.getValue().getList();
                boolean found = false;
                for (Pokemon pokemon : list) {
                    if (pokemon.getElement().equals( input )) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    entry.getValue().increaseBadges();
                } else {
                    for (Pokemon pokemon : list) {
                        pokemon.reduceHealth();
                        if (pokemon.getHealth() == 0) {
                            entry.getValue().removeFromList( pokemon );
                            break;
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        trainers.entrySet().stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getNumOfBadges(), b1.getValue().getNumOfBadges()))
                .forEach(t -> {
                    System.out.println(String.format("%s %s %s", t.getKey(),
                            t.getValue().getNumOfBadges(),
                            t.getValue().collectionSize()));
                });
    }
}

