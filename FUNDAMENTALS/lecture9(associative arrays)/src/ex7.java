import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
                students.get(name).add(grade);

            } else {
                students.get(name).add(grade);

            }
        }
        Map<String, Double> averageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> kvp : students.entrySet()) {
            double average = kvp.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
            if (average >= 4.50) {
                averageGrade.put(kvp.getKey(), average);
            }
        }

        averageGrade.entrySet().stream()
                .sorted((g1, g2) -> g2.getValue().compareTo(g1.getValue()))
                .forEach(grade -> {
                    System.out.println(String.format("%s -> %.2f", grade.getKey(), grade.getValue()));
                });
}}
