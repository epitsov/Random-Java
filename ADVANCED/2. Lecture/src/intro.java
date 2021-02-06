import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        int counter = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = counter++;
            }
            Arrays.stream( arr ).forEach( x-> System.out.println(x) );
        }
    }
}
