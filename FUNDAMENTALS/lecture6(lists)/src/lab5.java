import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split("\\s+");
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < input1.length; i++) {
            number.add(Integer.parseInt(input1[i]));
        }
        String line = scanner.nextLine();
        System.out.println();
        while (!line.equals("end")) {
            String[] inp = line.split("\\s+");

            if (inp[0].equals("Contains")) {
                boolean found = false;
                int numSearched = Integer.parseInt(inp[1]);
                for (int i = 0; i < number.size(); i++) {
                    if (numSearched == number.get(i)) {
                        found = true;
                        break;
                    }
                }
                if (found == true) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (inp[1].equals("even")) {
                for (int i = 0; i < number.size(); i++) {
                    if (number.get(i) % 2 == 0) {
                        if (i < number.size() - 1) {
                            System.out.print(number.get(i) + " ");
                        } else {
                            System.out.print(number.get(i));
                        }
                    }

                }
                System.out.println();
            } else if (inp[1].equals("odd")) {
                for (int j = 0; j < number.size(); j++) {
                    if (number.get(j) % 2 != 0) {
                        if (j < number.size() - 1) {
                            System.out.print(number.get(j) + " ");
                        } else {
                            System.out.print(number.get(j));
                        }
                    }

                }
                System.out.println();
            } else if (inp[0].equals("Get")) {
                int sum = 0;
                for (int j = 0; j < number.size(); j++) {
                    sum += number.get(j);
                }
                System.out.println(sum);
            } else if (inp[0].equals("Filter")) {
                int condition = Integer.parseInt(inp[2]);
                if (inp[1].equals(">")) {
                    for (int j = 0; j < number.size(); j++) {
                        if (number.get(j) > condition) {
                            if (j < number.size() - 1) {
                                System.out.print(number.get(j) + " ");
                            } else {
                                System.out.print(number.get(j));
                            }
                        }

                    }
                    System.out.println();
                } else if (inp[1].equals("<")) {
                    for (int j = 0; j < number.size(); j++) {
                        if (number.get(j) < condition) {
                            if (j < number.size() - 1) {
                                System.out.print(number.get(j) + " ");
                            } else {
                                System.out.print(number.get(j));
                            }
                        }
                    }
                    System.out.println();
                } else if (inp[1].equals(">=")) {
                    for (int j = 0; j < number.size(); j++) {
                        if (number.get(j) >= condition) {
                            if (j < number.size() - 1) {
                                System.out.print(number.get(j) + " ");
                            } else {
                                System.out.print(number.get(j));
                            }
                        }
                        System.out.println();
                    }
                } else {
                    for (int j = 0; j < number.size(); j++) {
                        if (number.get(j) <= condition) {
                            if (j < number.size() - 1) {
                                System.out.print(number.get(j) + " ");
                            } else {
                                System.out.print(number.get(j));
                            }
                        }
                    }
                    System.out.println();
                }
            }
            line = scanner.nextLine();
        }


        for (Integer x : number) {
            System.out.print(x + " ");
        }


    }
}
