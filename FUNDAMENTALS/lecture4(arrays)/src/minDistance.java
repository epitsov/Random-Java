import java.util.Scanner;

public class minDistance {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int [] numbers= {5, 10 , 12, 37, 40, 4};
        int min= Math.abs(numbers[0]-numbers[1]);
        for (int firstIndex = 0; firstIndex <numbers.length-1 ; firstIndex++) {
            int first=numbers[firstIndex];
            for (int secondIndex = firstIndex+1; secondIndex <numbers.length ; secondIndex++) {
                int second= numbers[secondIndex];
                int distance=Math.abs(first-second);
                if(distance<min)
                {min=distance;}
            }
        }
        System.out.println(min);
    }
}
