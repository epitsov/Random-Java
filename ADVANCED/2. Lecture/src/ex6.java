import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String operation = scanner.nextLine().replaceAll( "[A-z]+", "" );
        Pattern pattern = Pattern.compile( "[0-9]+" );
        Matcher matcher = pattern.matcher( operation );
        final String s = operation.replaceFirst( "\\(", "" );
        final String s1 = s.replaceAll( "\\)", "" );
        int degrees = Integer.parseInt( s1 );


        while (true) {
            degrees %= 360;
            if (degrees == 90 || degrees == 270 || degrees == 180 | degrees == 0) {
                break;
            }
        }
        ArrayList<String> matrix = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals( "END" )) {
            matrix.add( input );
            input = scanner.nextLine();
        }

        if (degrees == 0) {
            for (int i = 0; i < matrix.size(); i++) {
                System.out.println( matrix.get( i ) );
            }
        } else if (degrees == 90) {
            changeMatrixTo90( matrix );

        } else if (degrees == 180) {
            changeMatrixTo180( matrix );
        } else {
            changeMatrixTo270( matrix );

        }

    }

    private static void changeMatrixTo270(ArrayList<String> matrix) {
        int maxSize = 0;
        for (int i = 0; i < matrix.size(); i++) {
            if (matrix.get( i ).length() > maxSize) {
                maxSize = matrix.get( i ).length();
            }
        }
        for (int element = 0; element < maxSize; element++) {
            for (int i = 0; i < matrix.size(); i++) {
                if (matrix.get( i ).length() < maxSize - element) {
                    System.out.print( " " );
                } else {
                    System.out.print( matrix.get( i ).charAt( maxSize - 1 - element ) + "" );
                }
            }
            System.out.println();
        }
    }

    private static void changeMatrixTo180(ArrayList<String> matrix) {
        for (int i = matrix.size() - 1; i >= 0; i--) {
            for (int j = matrix.get( i ).length() - 1; j >= 0; j--) {
                System.out.print( matrix.get( i ).charAt( j ) );
            }
            System.out.println();
        }
    }

    private static void changeMatrixTo90(ArrayList<String> matrix) {
        int maxSize = 0;
        for (int i = 0; i < matrix.size(); i++) {
            if (matrix.get( i ).length() > maxSize) {
                maxSize = matrix.get( i ).length();
            }
        }
        for (int element = 0; element < maxSize; element++) {
            for (int i = 0; i < matrix.size(); i++) {
                if (matrix.get( matrix.size() - 1 - i ).length() <= element) {
                    System.out.print( " " );
                } else {
                    System.out.print( matrix.get( matrix.size() - 1 - i ).charAt( element ) );
                }
            }
            System.out.println();
        }

    }
}
