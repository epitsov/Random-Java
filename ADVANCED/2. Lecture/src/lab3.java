import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int rows = Integer.parseInt( scanner.nextLine() );
        int cols = Integer.parseInt( scanner.nextLine() );
        char[][] firstMatrix = readCharMatrix( scanner, rows, cols );
        char[][] secondMatrix = readCharMatrix( scanner, rows, cols );
        char [] [] answer=new char[rows][cols];
        for (int row = 0; row <rows ; row++) {
            for (int col = 0; col <cols ; col++) {
                if(firstMatrix[row][col]==secondMatrix[row][col]) {
                    answer[row][col] = firstMatrix[row][col];
                }
            else
                {answer[row][col]='*';}
            }
        }
        printMatrix( answer );
    }
    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print( matrix[i][j] + " " );
            }
            System.out.println();

        }
    }
    private static char[][] readCharMatrix(Scanner scanner, int rows, int cols) {
        char[][] matrix = new char[rows][];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String strippedString = line.replaceAll( "\\s+", "" );
            matrix[row] = strippedString.toCharArray();

        }
        return matrix;
    }
}
