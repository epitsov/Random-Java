import java.util.Scanner;

public class stringsum4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text =scanner.nextLine();
        int sum=0;
        for(int position=0;position<text.length();position++)
        {char letter=text.charAt(position);
            switch(letter)
            { case 'a':
                sum++;
                break;
                case 'e':
                    sum+=2;
                    break;
                case 'i':
                    sum+=3;
                    break;
                case 'o':
                    sum+=4;
                    break;
                case 'u':
                    sum+=5;
                    break;}

        }
        System.out.println(sum);
    }
}
