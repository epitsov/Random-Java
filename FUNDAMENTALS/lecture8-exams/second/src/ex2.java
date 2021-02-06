import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("\\|");
        List<Integer> archeryfield = new ArrayList<>();
        for (int i = 0; i <parts.length ; i++) {
            archeryfield.add(Integer.parseInt(parts[i]));
        }
        String input = scanner.nextLine();
        int pointsaved=0;
        while (!input.equals("Game over")) {
            String[] line = input.split("@");
            String command = line[0];
            switch (command) {
                case "Shoot Left": {
                    int startIndex = Integer.parseInt(line[1]);
                    int lenght = Integer.parseInt(line[2]);
                    if (indexInRange(startIndex, archeryfield)) {
                    pointsaved=    shootleft(startIndex,lenght,archeryfield,pointsaved);                    }
                    break;
                }
                case "Shoot Right":{
                    int startIndex = Integer.parseInt(line[1]);
                    int lenght = Integer.parseInt(line[2]);
                    if (indexInRange(startIndex, archeryfield)) {
                       pointsaved= shootright(startIndex,lenght,archeryfield,pointsaved);
                    }
                    break;
                }
                case "Reverse":
                    reverse(archeryfield);
                    break;
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < archeryfield.size(); i++) {
            if(i==archeryfield.size()-1)
            {System.out.print(archeryfield.get(i));
            break;}
            System.out.print(archeryfield.get(i)+" - ");
        }
        System.out.println();
        System.out.printf("Iskren finished the archery tournament with %d points!",pointsaved);

    }

    private static void reverse(List<Integer> archeryfield) {
        for (int i = 0; i <archeryfield.size() /2; i++) {
            int swapnum1=archeryfield.get(i);
            int swapnum2=archeryfield.get(archeryfield.size()-1-i);
            archeryfield.set(i,swapnum2);
            archeryfield.set(archeryfield.size()-1-i,swapnum1);
        }
        }



    private static Integer shootright(int startIndex, int lenght, List<Integer> archeryfield, int pointssaved) {
        int endindex=startIndex+lenght;
        while(endindex>archeryfield.size())
        {endindex=endindex-archeryfield.size();}

        if(archeryfield.get(endindex)<=5) {
            int result=archeryfield.get(endindex);
            archeryfield.set(endindex,0);
            return pointssaved+=result;
        }
        else {
            int result=archeryfield.get(endindex)-5;
            archeryfield.set(endindex,result);
           return   pointssaved+=5;
        }
    }

    private  static Integer shootleft(int startIndex, int lenght, List<Integer> archeryfield,int pointssaved) {
        int endindex=startIndex-lenght;
        while(endindex<0)
        {endindex=archeryfield.size()+endindex;}

        if(archeryfield.get(endindex)<=5) {
            int result=archeryfield.get(endindex);
            archeryfield.set(endindex,0);
           return pointssaved+=result;
        }
        else {
            int result=archeryfield.get(endindex)-5;
            archeryfield.set(endindex,result);
            return pointssaved+=5;
        }

       }

    private static boolean indexInRange(int startIndex, List<Integer> archeryfield) {
        return startIndex >= 0 && startIndex < archeryfield.size();
    }

}

