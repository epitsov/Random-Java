import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("\\|");
        List<String> word = new ArrayList<>(Arrays.asList(parts));
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] line = input.split(" ");
            String command = line[0] +" "+ line[1];
            switch (command) {
                case "Move Left":{
                    int index=Integer.parseInt(line[2]);
                    if(indexexist(index,word)&&moveleftPossible(index,word))
                    {switchwords1(index,word);}
                    break;}
                case "Move Right":{
                    int index=Integer.parseInt(line[2]);
                    if(indexexist(index,word)&&moverightPossible(index,word))
                    {switchwords(index,word);}
                    break;}
                case "Check Even":
                    String evenword=findevennums(word);
                    System.out.println(evenword);
                    break;
                case "Check Odd":
                    String oddword=findoddnums(word);
                    System.out.println(oddword);
                    break;


            }

            input = scanner.nextLine();
        }
        String wordCreated="";
        for (int i = 0; i <word.size() ; i++) {
            wordCreated+=word.get(i);
        }
        System.out.println("You crafted "+wordCreated+"!");
    }

    private static String findoddnums(List<String> word) {
        String output="";
        for (int i = 0; i <word.size() ; i++) {
            if(i%2!=0)
            output+=word.get(i)+" ";
        }
        return output;}

    private static String findevennums(List<String> word) {
       String output="";
        for (int i = 0; i <word.size() ; i++) {
            if(i%2==0)
            {output+=word.get(i)+" ";}
        }
        return output;
    }

    private static void switchwords1(int index, List<String> word) {
        String word1=word.get(index);
        String word2=word.get(index-1);
        word.set(index,word2);
        word.set(index-1,word1);
    }

    private static boolean moveleftPossible(int index, List<String> word) {
        return  index-1>=0; }

    private static void switchwords(int index, List<String> word) {
        String word1=word.get(index);
        String word2=word.get(index+1);
        word.set(index,word2);
        word.set(index+1,word1);

    }

    private static boolean moverightPossible(int index, List<String> word) {
        return  index+1<word.size();
    }

    private static boolean indexexist(int index, List<String> word) {
        return index>=0 && index<word.size();
    }
}
