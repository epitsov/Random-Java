import java.security.PrivilegedExceptionAction;
import java.util.Scanner;

public class repeatString {
    static String repeatStr(String s, int repeatCount) {
        String[] repeatArr = new String[repeatCount];
        for (int i = 0; i < repeatArr.length; i++) {
            repeatArr[i] = s;
        }
        return String.join("", repeatArr);
    }

    static int[] readArray(Scanner scanner) {
        int lenght = scanner.nextInt();
        int[] num = new int[lenght];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        return num;
    }
    static void printArray(int [] num)
    {for(int number:num)

    {
        System.out.print(number + " ");

    }}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int repeat = scanner.nextInt();
        String repeeated = repeatStr(str, repeat);
        System.out.println(repeeated);
        //int[] num = readArray(scanner);
       //printArray(num);

    }
}


