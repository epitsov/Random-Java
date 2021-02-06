import java.util.Scanner;

public class endRow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       String numberLine= scanner.nextLine();
       String[] numberStrings=numberLine.split(" ");
       int [] numbers=new int[numberStrings.length];
        //for (int i = 0; i <numberStrings.length ; i++) {
         //   System.out.println(numberStrings[i]);
        // if (i<numberString.length-1){
           // System.out.println(", ")};
        //} drug nachin za printirane:
        //String.join(", ",numberStrings);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(numberStrings[i]);

        }
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(2*numbers[i]);

        }//vij lekciqta za chainmethod
    }
}
