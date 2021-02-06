import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(":");
        List<String> comands = new ArrayList<>(Arrays.asList(parts));
        String input = scanner.nextLine();
        List<String> mycards = new ArrayList<>();

        while (!input.equals("Ready")) {
            String[] line = input.split(" ");
            String currentcommand = line[0];
            switch (currentcommand) {
                case "Add": {
                    if (cardexists(line[1], comands)) {
                        String card = line[1];
                        mycards.add(card);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                }
                case "Insert": {
                    int index = Integer.parseInt(line[2]);
                    if (cardexists(line[1], comands) && validIndex(index, mycards)) {
                        mycards.add(index, line[1]);

                    } else {
                        System.out.println("Error!");
                    }
                    break;
                }
                case "Remove": {
                    String card = line[1];
                    if (cardexists(card, mycards)) {
                        removecard(card, mycards);
                    }
                    else
                    {
                        System.out.println("Card not found.");
                    }
                    break;
                }
                case "Swap": {
                    String card1 = line[1];
                    String card2 = line[2];
                    swapcards(card1, card2, mycards);
                    break;
                }
                case "Shuffle": {
                    reversedeck(mycards);
                    break;
                }

            }
            input = scanner.nextLine();
        }


        for (int i = 0; i <  mycards.size(); i++) {
            if (i == comands.size() - 1) {
                System.out.print(mycards.get(i));
            } else {
                System.out.print(mycards.get(i) + " ");
            }
        }
    }

    private static void reversedeck(List<String> comands) {
        for (int i = 0; i < comands.size() / 2; i++) {
            String firstcommand = comands.get(i);
            String lastcommand = comands.get(comands.size() - 1 - i);
            comands.set(i, lastcommand);
            comands.set(comands.size() - 1 - i, firstcommand);

        }


    }

    private static void swapcards(String card1, String card2, List<String> comands) {
        int index1 = comands.indexOf(card1);
        int index2 = comands.indexOf(card2);
        comands.set(index1, card2);
        comands.set(index2, card1);
    }

    private static void removecard(String card, List<String> comands) {
        comands.remove(card);
    }

    private static boolean cardexists(String card, List<String> comands) {
        for (String comand : comands) {
            if (comand.equals(card)) {
                return true;
            }
        }
        return false;
    }

    private static void insertcard(int index, String s, List<String> comands) {
        comands.add(index, s);
    }

    private static boolean validIndex(int index, List<String> comands) {
        return index >= 0 && index < comands.size();
    }

    private static boolean cardisvalid(String[] line) {
        return line.length > 0;
    }

}

