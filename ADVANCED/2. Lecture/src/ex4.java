import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        // int[][] matrix = readMatrix( scanner );
        int[] dimensions = Arrays.stream( scanner.nextLine().split( "\\s+" ) )
                .mapToInt( Integer::parseInt )
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];
        int indexRow=0;
        int indexCol=0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream( scanner.nextLine().split( "\\s+" ) )
                    .mapToInt( Integer::parseInt )
                    .toArray();
        }
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                int sum = calculateMatrixSum( matrix, i, j );
                if (sum > maxNum) {
                    maxNum = sum;
                    indexRow=i;
                    indexCol=j;
                }

            }
        }
        System.out.println("Sum = "+maxNum);
        printMaxSubMatrix(matrix,indexRow,indexCol);


    }

    private static void printMaxSubMatrix(int[][] matrix, int indexRow, int indexCol) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                System.out.print(matrix[indexRow+i][indexCol+j]+" ");
            }
            System.out.println();
        }
    }

    private static int calculateMatrixSum(int[][] matrix, int row, int col) {
        int sum = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                sum += matrix[row + i][col + j];
            }
        }
        return sum;
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

    private static int[][] centerMatrix(Scanner scanner, int[][] matrix) {
        String line = scanner.nextLine();
        String[] split = line.split( "\\s+" );
        int rows = matrix.length;
        int cols = matrix[rows].length;
        int[][] matrix1 = new int[3][3];
        for (int row = 1; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                matrix1[row][col] = matrix[row + 1][col + 1];
            }

        }
        return matrix;
    }
}
