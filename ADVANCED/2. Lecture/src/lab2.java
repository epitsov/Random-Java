import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[][] matrix = readMatrix( scanner );
        int number = Integer.parseInt( scanner.nextLine() );
        Deque<String> answers = new ArrayDeque<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (number == matrix[row][col]) {
                    String pair = row + " " + col;
                    answers.offer( pair );
                }
            }

        }
        if (answers.isEmpty()) {
            System.out.println( "not found" );
        } else {
            while (!answers.isEmpty()) {
                System.out.println( answers.poll() );
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print( matrix[i][j] + " " );
            }
            System.out.println();

        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split( "\\s+" );
        int rows = Integer.parseInt( split[0] );
        int cols = Integer.parseInt( split[1] );
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            line = scanner.nextLine();
            split = line.split( "\\s+" );
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt( split[col] );
            }

        }
        return matrix;
    }
}
