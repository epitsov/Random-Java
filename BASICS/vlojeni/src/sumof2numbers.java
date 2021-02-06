import java.util.Scanner;

public class sumof2numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int limit = Integer.parseInt(scanner.nextLine());
        boolean combinationFound=false;
        int counter=0;
        for (int first = begin; first <= end; first++) {
            for (int second = begin; second <= end; second++) {
                int sum = first + second;
                counter++;
                if (sum == limit) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",counter, first, second, limit);
                combinationFound=true;
                break;
                }


            }
            if(combinationFound) {
            break;}


            }
        if (combinationFound==false)
        {System.out.printf("%d combinations - either equals %d",counter,limit);}
        }

    }

