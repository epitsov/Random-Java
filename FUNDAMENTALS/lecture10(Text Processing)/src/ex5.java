import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
        int remainer = 0;
        if(multiplier==0)
        {
            System.out.println(0);
            return;
        }
        while (numberAsString.charAt(0)=='0')
        {numberAsString=numberAsString.substring(1);}
        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            int product = digit * multiplier + remainer;
            result.append(product % 10);
            remainer = product / 10;

        }
        if(remainer!=0){
        result.append(remainer);}
        System.out.println(result.reverse());
    }
}
