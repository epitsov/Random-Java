package ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Vihecle> vihecles = new ArrayList<>();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            String brand = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);
            Vihecle vihecle;
            if ("car".equals(type)) {
                vihecle = new Vihecle("Car", brand, color, horsepower);
                vihecles.add(vihecle);
            } else {
                vihecle = new Vihecle("Truck", brand, color, horsepower);
            }
            vihecles.add(vihecle);
            input = scanner.nextLine();
        }
        String model = scanner.nextLine();
        while (!"Close the Catalogue".equals(model)) {
            for (Vihecle vihecle : vihecles) {
                if (vihecle.getModel().equals(model)) {
                    System.out.println(vihecle);
                    break;
                }
            }
            model = scanner.nextLine();
        }
        double carHP = printHorsePower(vihecles, "Car");
        System.out.println(String.format("Cars have average horsepower of: %.2f.", carHP));
        double truckHP = printHorsePower(vihecles, "Truck");
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckHP));

    }

    public static double printHorsePower(ArrayList<Vihecle> vihecles, String type) {
        double sum = 0.0;
        int counter = 0;
        for (Vihecle vihecle : vihecles) {
            if (vihecle.getType().equals(type)) {
                sum += vihecle.getHorsePower();
                counter++;
            }
        }
        if (counter == 0) {
            return 0;
        }
        return sum / counter;
    }
}
