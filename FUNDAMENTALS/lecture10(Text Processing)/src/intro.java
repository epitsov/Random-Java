import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int key=Integer.parseInt(scanner.nextLine());
        String cypherText=encrypt(input,key );
        System.out.println(cypherText);

    }

    private static String encrypt(String input, int key) {
  char[] inputChars= input.toCharArray();
        for (int i = 0; i <inputChars.length ; i++) {
            inputChars[i]+=key;
        }
        return new String(inputChars);

    }
}
