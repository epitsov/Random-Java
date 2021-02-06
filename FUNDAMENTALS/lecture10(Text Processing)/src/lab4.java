import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inp=scanner.nextLine();
        List<Character> digits=new LinkedList<>();
        List<Character> letter=new LinkedList<>();
        List<Character> charecters=new LinkedList<>();
        for (int i = 0; i <inp.length() ; i++) {
            char currentChar=inp.charAt(i);

            if(Character.isDigit(currentChar))
            {
                digits.add(currentChar);
            }
            else if(Character.isLetter(currentChar))
            {letter.add(currentChar);}
            else
            {charecters.add(currentChar);}
        }
        digits.stream().forEach(x-> System.out.print(x));
        System.out.println();
        letter.stream().forEach(x-> System.out.print(x));
        System.out.println();
        charecters.stream().forEach(x-> System.out.print(x));
    }
}
