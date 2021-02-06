import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String[] inpt = scanner.nextLine().split( " " );
        int rows = Integer.parseInt( inpt[0] );
        int cols = Integer.parseInt( inpt[1] );
        String matrix[][] = new String[rows][cols];
        char k = 'a';
        char v = 'a';
        for (int row = 0; row < rows; row++) {
            for (int j = 0; j < cols; j++) {
                matrix[row][j] = ( v +""+ k +"" +v );
                k += 1;
            }
            v += 1;
            k=v;
        }
        printMatrix( matrix);

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
