import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[][] matrix = readMatrix( scanner );
        int[][] maxMatrix = new int[2][2];
        int maxsum = -1000000;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (maxsum < subMatrixsum( matrix, row, col )) {
                    maxMatrix = subMatrix( matrix, row, col );
                    maxsum = subMatrixsum( matrix, row, col );
                }
            }
        }
        printMatrix( maxMatrix );
        System.out.println( maxsum );
    }
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print( matrix[i][j] + " " );
            }
            System.out.println();

        }
    }
    private static int subMatrixsum(int[][] matrix, int row, int col) {
        int[][] subMatrix = new int[2][2];
        int sum = 0;
        int altRows = 0;
        int altCols = 0;
        for (int rows = row; rows < matrix.length; rows++) {
            for (int cols = col; cols < matrix[rows].length; cols++) {
                if (altCols > 1) {
                    altCols = 0;
                    break;
                }
                if (altRows > 1) {
                    break;
                }
                subMatrix[altRows][altCols] = matrix[rows][cols];
                altCols++;
            }
            if (altRows > 1) {
                altRows = 0;
                break;
            }
            altCols = 0;
            altRows++;

        }
        for (int i = 0; i < subMatrix.length; i++) {
            for (int j = 0; j < subMatrix[i].length; j++) {
                sum += subMatrix[i][j];
            }

        }
        return sum;
    }

    private static int[][] subMatrix(int[][] matrix, int row, int col) {
        int[][] subMatrix = new int[2][2];
        int sum = 0;
        int altRows = 0;
        int altCols = 0;
        for (int rows = row; rows < matrix.length; rows++) {
            for (int cols = col; cols < matrix[rows].length; cols++) {
                if (altCols > 1) {
                    altCols = 0;
                    break;
                }
                if (altRows > 1) {
                    break;
                }
                subMatrix[altRows][altCols] = matrix[rows][cols];
                altCols++;
            }
            if (altRows > 1) {
                altRows = 0;
                break;
            }
            altCols = 0;
            altRows++;

        }

        return subMatrix;
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
