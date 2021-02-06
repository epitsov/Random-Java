package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<People> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            People person= new People(name,age);
            people.add(person);
        }
        people
                .stream()
                .filter(p-> p.getAge()>30)
                .sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
                .forEach(p-> System.out.println(p.toString()));
    }
}
