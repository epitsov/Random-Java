import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[][] matrix = readMatrix( scanner );
        int sum = 0;
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                sum += matrix[rows][cols];

            }
        }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);

    }

    private static int[][] readMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split( ", " );
        int rows = Integer.parseInt( split[0] );
        int cols = Integer.parseInt( split[1] );
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            line = scanner.nextLine();
            split = line.split( ", " );
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt( split[col] );
            }

        }
        return matrix;
    }
}
