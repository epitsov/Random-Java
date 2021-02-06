import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String[][] matrix = readMatrix( scanner );
        String fillChar = scanner.nextLine();
        String[] tokes = scanner.nextLine().split( " " );
        int rows = Integer.parseInt( tokes[0] );
        int cols = Integer.parseInt( tokes[1] );
        boolean noMore = true;
        while (noMore) {
            for (int rowDirection = -1; rowDirection <= 1; rowDirection++) {
                for (int colDirection = -1; colDirection <= 1; colDirection++) {
                    if (matrix[rows + rowDirection][cols + colDirection].equals( matrix[rows][cols])) {
                        matrix[rows][cols] = fillChar;
                        matrix[rows + rowDirection][cols + colDirection] = fillChar;
                    } else {
                        matrix[rows][cols] = fillChar;
                        noMore = false;

                    }


                }
            }
        }

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
                matrix[row][col] = ( split[col] );
            }

        }
        return matrix;
    }
}
