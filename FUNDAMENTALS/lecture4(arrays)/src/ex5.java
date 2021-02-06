import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        String nums[]= input.split(" ");
        int [] numbers=new int[nums.length];
        int counter=0;
        for (int i = 0; i <nums.length ; i++) {
            numbers[i]=Integer.parseInt(nums[i]);
        }
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i+1 ;j < numbers.length ; j++) {
                if(numbers[i]>numbers[j])
                {counter++;
                }
                if((counter>=numbers.length-1-i)&&(numbers[i]>numbers[j]))
                {
                    System.out.print(numbers[i]+ " ");
                }

            }
            counter=0;

        }
        System.out.print(numbers[numbers.length-1]);
    }
}
