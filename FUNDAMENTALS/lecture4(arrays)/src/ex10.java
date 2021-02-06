import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        String input1 = scanner.nextLine();
        int positionsArray[] = new int[lenght];
        String positions1[] = input1.split(" ");
            for (int i = 0; i < positions1.length; i++) {


                int z=Integer.parseInt(positions1[i]);
                positionsArray[z]=1;
            }

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String indexes[] = input.split(" ");
            if (indexes[1].equals("right")) {
                int index = Integer.parseInt(indexes[0]);
                int flyLenght = Integer.parseInt(indexes[2]);
                int newIndex = index + flyLenght;

                if(positionsArray[index]==0)
                {continue;}
                positionsArray[index] = 0;
                if (newIndex > positionsArray.length - 1) {
                    continue;
                }
                if (positionsArray[newIndex] == 1) {
                    if (newIndex + 1 > positionsArray.length - 1) {
                        continue;
                    } else {
                        positionsArray[newIndex + 1] = 1;
                    }
                } else {
                    positionsArray[newIndex] = 1;

                }
            }
            if (indexes[1].equals("left")) {
                int index = Integer.parseInt(indexes[0]);
                int flyLenght = Integer.parseInt(indexes[2]);
                int newIndex = (index - flyLenght);
                positionsArray[index] = 0;
                if (newIndex < 0) {
                    continue;
                }
                else if (positionsArray[newIndex] == 1) {
                    if (newIndex - 1 <0) {
                        continue;
                    } else {
                        positionsArray[newIndex -1] = 1;}}
                else
                {positionsArray[newIndex]=1;}


            }

        }
        for (int i = 0; i < positionsArray.length; i++) {
            System.out.print(positionsArray[i] + " ");
        }

    }
}

