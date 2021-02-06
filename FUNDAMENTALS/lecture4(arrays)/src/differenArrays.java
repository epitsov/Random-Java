import java.util.Scanner;

public class differenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers1 = scanner.nextLine();
        String numbers2 = scanner.nextLine();
        String array1[] = numbers1.split(" ");
        String array2[] = numbers2.split(" ");
        int[] numbersInt = new int[array1.length];
        int[] numberInt2 = new int[array2.length];
        int indexdifference = 0;
        int sum2 = 0;
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            numbersInt[i] = Integer.parseInt(array1[i]);
        }
        for (int j = 0; j < array2.length; j++) {
            numberInt2[j] = Integer.parseInt(array2[j]);
        }
        for (int i = 0; i <array1.length ; i++) {
            if(numbersInt[i]!=numberInt2[i])
            {
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                break;
            }
        }
        for (int number : numbersInt) {
            sum += number;
        }
        for (int number1 : numberInt2) {
            sum2 += number1;
        }
if (sum==sum2)
{
    System.out.printf("Arrays are identical. Sum: %d",sum);
}

    }
}
