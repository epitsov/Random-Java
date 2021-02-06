import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String[][] matrix = readMatrix( scanner );
        String inputs = scanner.nextLine();
        while (!inputs.equals( "END" )) {
            String[] tokens = inputs.split( " " );

            if (!tokens[0].equals( "swap" ) || tokens.length < 5 ||validValues( tokens, matrix )) {
                System.out.println( "Invalid input!" );
            } else {
                int row1 = Integer.parseInt( tokens[1] );
                int col1 = Integer.parseInt( tokens[2] );
                int row2 = Integer.parseInt( tokens[3] );
                int col2 = Integer.parseInt( tokens[4] );
                swapMatrix( matrix, row1, col1, row2, col2 );
                printMatrix( matrix );

            }


            inputs = scanner.nextLine();
        }


    }

    private static boolean validValues(String[] tokens, String[][] matrix) {
        int r1 = Integer.parseInt( tokens[1] );
        int c1 = Integer.parseInt( tokens[2] );
        int r2 = Integer.parseInt( tokens[3] );
        int c2 = Integer.parseInt( tokens[4] );
        int rowLenght = matrix.length;
        int colLenght = matrix[0].length;
        return r1 > rowLenght - 1 || r2 > rowLenght - 1 || c1 > colLenght - 1 || c2 > colLenght - 1;
    }

    private static String[][] swapMatrix(String[][] matrix, int row1, int col1, int row2, int col2) {
        String value = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = value;

        return matrix;
    }

    private static String[][] readMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split( "\\s+" );
        int rows = Integer.parseInt( split[0] );
        int cols = Integer.parseInt( split[1] );
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            line = scanner.nextLine();
            split = line.split( "\\s+" );
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = (split[col]);
            }

        }
        return matrix;
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print( matrix[i][j] + " " );
            }
            System.out.println();
        }
    }
}
