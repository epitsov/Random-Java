import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        char[][] board = readCharMatrix( scanner, 8, 8 );
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 'q' && isValidQueen( row, col, board )) {
                    System.out.println( row + " " + col );
                }
            }
        }

    }

    private static boolean isValidQueen(int row, int col, char[][] board) {

        for (int rowDirection = -1; rowDirection <= 1; rowDirection++) {

            for (int colDirection = -1; colDirection <= 1; colDirection++) {
                if(rowDirection==0&&colDirection==0)
                {continue;}
                int currentrow = row + rowDirection;
                int currentcol = col + colDirection;
                boolean validPosition = currentrow >= 0 && currentrow < board.length && currentcol > 0
                        && currentcol < board[currentrow].length;
                while (validPosition) {
                    if ('q' == board[currentrow][currentcol]) {
                        return false;
                    }
                    currentrow = currentrow + rowDirection;
                    currentcol = currentcol+ colDirection;
                    validPosition = currentrow >= 0 && currentrow < board.length && currentcol > 0
                            && currentcol < board[currentrow].length;
                }
            }
        }
        return true;


    }

    private static char[][] readCharMatrix(Scanner scanner, int rows, int cols) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String strippedString = line.replaceAll( "\\s+", "" );
            matrix[row] = strippedString.toCharArray();

        }
        return matrix;
    }
}
