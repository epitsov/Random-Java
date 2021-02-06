import java.util.Scanner;

public class findNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isDigit(s.charAt(i)))
            {sb.append(s.charAt(i));}
        }
        int i=Integer.parseInt(sb.toString());
        System.out.println(i);

    }
}
