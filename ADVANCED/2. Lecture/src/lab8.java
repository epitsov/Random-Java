import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        int[][] matrix = readMatrix( scanner );
        String line = scanner.nextLine();
        String[] tokens = line.split( "\\s+" );
        int row = Integer.parseInt( tokens[0] );
        int col = Integer.parseInt( tokens[1] );
        int number = matrix[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number) {
                    int changednum = returnsum( i, j, matrix );
                    matrix[i][j] = changednum;
                }
            }
        }
        printMatrix( matrix );


    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print( matrix[i][j] + " " );
            }
            System.out.println();

        }
    }

    private static boolean leftNumber(int row, int col, int[][] matrix) {
        return matrix[row][col-1] != matrix[row][col] ;
    }
    private static boolean rightNumber(int row, int col, int[][] matrix) {
        return matrix[row ][col+1] != matrix[row][col] ;
    }
    private static boolean upperNumber(int row, int col, int[][] matrix) {
        return matrix[row+1 ][col] != matrix[row][col] ;
    }
    private static boolean LowerNumber(int row, int col, int[][] matrix) {
        return matrix[row-1 ][col] != matrix[row][col] ;
    }

    private static int returnsum(int row, int col, int[][] matrix) {
        int sum = 0;
        if (row - 1 >= 0&&LowerNumber(row,col,matrix  )) {
            sum += matrix[row - 1][col];
        }
        if (row + 1 < matrix.length&&upperNumber( row,col,matrix )) {
            sum += matrix[row + 1][col];
        }
        if (col - 1 >= 0&&leftNumber( row, col, matrix )) {
            sum += matrix[row][col - 1];
        }
        if (col + 1 < matrix[row].length&&rightNumber( row, col, matrix )) {
            sum += matrix[row][col + 1];
        }
        return sum;
    }

    private static int[][] readMatrix(Scanner scanner) {
        int rows = Integer.parseInt( scanner.nextLine() );
        String[] matrix = new String[rows];
        int cols = 0;
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String[] split = line.split( "\\s" );
            cols = split.length;
            matrix[row] = line;
        }
        int[][] matrix1 = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] arr = matrix[row].split( "\\s" );
            for (int col = 0; col < cols; col++) {
                matrix1[row][col] = Integer.parseInt( arr[col] );
            }
        }
        return matrix1;
    }

}
