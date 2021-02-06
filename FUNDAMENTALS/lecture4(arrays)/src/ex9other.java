
import java.util.Scanner;

public class ex9other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sequenceLenght = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        int bestLenght = 0;
        String bestdna = "";
        int bestindex = 0;
        int bestsum = 0;
        int counter = 0;
        int bestcounter = 0;
        while (!line.equals("Clone them!")) {
            counter++;
            String sequence = line.replaceAll("!", "");
            String[] dnas = sequence.split("0");
            int maxLenght = 0;
            int sum = 0;
            String bestlocaldna = "";
            for (int i = 0; i < dnas.length; i++) {

                if (dnas[i].length() > maxLenght) {
                    maxLenght = dnas[i].length();
                    bestlocaldna = dnas[i];
                }
                sum += dnas[i].length();
            }
            int beginIndex = sequence.indexOf(bestlocaldna);
            if (maxLenght > bestLenght) {
                bestLenght = maxLenght;
                bestdna = sequence;
                bestindex = beginIndex;
                bestsum = sum;
                bestcounter = counter;
            } else if (maxLenght == bestLenght && (beginIndex < bestindex || sum > bestsum)) {
                {
                    bestLenght = maxLenght;
                    bestdna = sequence;
                    bestindex = beginIndex;
                    bestsum = sum;
                    bestcounter = counter;

                }

            }
            else if(counter==1)
            {  bestLenght = maxLenght;
                bestdna = sequence;
                bestindex = beginIndex;
                bestsum = sum;
                bestcounter = counter;}
            line = scanner.nextLine();
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestcounter, bestsum));
        for (int i = 0; i <bestdna.length() ; i++) {
            System.out.print(bestdna.charAt(i)+" ");
        }
        System.out.println();
    }
}