import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String line = scanner.nextLine();
        String[] split = line.split( "\\s+" );
        int rows = Integer.parseInt( split[0] );
        int[][] matrix = readMatrix( scanner,rows );
        int mainDiagonal = 0;
        int secondDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    mainDiagonal += matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i +j==rows-1) {
                    secondDiagonal+=matrix[i][j];

                }
            }
        }
        System.out.println( Math.abs( secondDiagonal-mainDiagonal ));
    }

    private static int[][] readMatrix(Scanner scanner,int rows) {

        int[][] matrix = new int[rows][rows];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String []split = line.split( "\\s+" );
            for (int col = 0; col < rows; col++) {
                matrix[row][col] = Integer.parseInt( split[col] );
            }

        }
        return matrix;
    }
}
