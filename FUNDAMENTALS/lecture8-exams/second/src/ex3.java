import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("&");
        List<String> books = new ArrayList<>(Arrays.asList(parts));
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] line = input.split(" \\| ");
            String command = line[0];
            switch (command) {
                case "Add Book": {
                    String book = line[1];
                    if (!bookIsPresent(book, books)) {
                        addBook(book, books);
                    }
                    break;
                }
                case "Take Book": {
                    String book = line[1];
                    if (bookIsPresent(book, books)) {
                        takeBook(book, books);
                    }
                    break;
                }
                case "Swap Books": {
                    String book = line[1];
                    String book2 = line[2];
                    if (bookIsPresent(book, books) && bookIsPresent(book2, books)) {
                        swapBooks(book, book2, books);
                    }
                    break;
                }
                case "Insert Book":{
                    String book = line[1];
                    if (!bookIsPresent(book, books)) {
                        insertBook(book, books);
                    }
                    break;
                }
                case "Check Book": {
                        int index = Integer.parseInt(line[1]);
                        if (validIndex(index, books)) {
                            String name=books.get(index);
                            System.out.println(name);
                        }
                        break;

                }
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < books.size(); i++) {
            if (i == books.size() - 1) {
                System.out.print(books.get(i));
                break;
            }
            System.out.print(books.get(i) + ", ");
        }
    }

    private static boolean validIndex(int index, List<String> books) {
        return index>=0&&index<books.size();
    }

    private static void insertBook(String book, List<String> books) {
        books.add(book);
    }

    private static void swapBooks(String book, String book2, List<String> books) {
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < books.size(); i++) {
            if (book.equals(books.get(i))) {
                index1 = i;
            }
            if (book2.equals(books.get(i))) {
                index2 = i;
            }
        }
        books.set(index1, book2);
        books.set(index2, book);

    }

    private static void takeBook(String book, List<String> books) {
        books.remove(book);
    }

    private static void addBook(String book, List<String> books) {
        books.add(0, book);
    }

    private static boolean bookIsPresent(String book, List<String> books) {
        for (String s : books) {
            if (s.equals(book)) {
                return true;
            }
        }
        return false;
    }
}
