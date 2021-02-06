import java.util.Scanner;

public class golf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double numberholes = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        double sum1 = 0.0;
        double score = 0.0;
        double score1 = 0.0;
        int counter = 1;
        double counterall =  numberholes;
        for (int i = 0; i < numberholes; i++) {
            int hole = Integer.parseInt(scanner.nextLine());
            String hit = scanner.nextLine();
            for (int z = 0; z <= hit.length() - 1; z++) {
                char v = hit.charAt(z);
                sum += v;
            }
            score = sum / hit.length();
            while (score <= hole) {
                String hit1 = scanner.nextLine();
                if(hit1.equals(""))
                {continue;}
                counterall++;
                for (int b = 0; b <= hit1.length() - 1; b++) {
                    char h = hit1.charAt(b);
                    sum1 += h;
                }
                counter++;
                score1 = sum1 / hit1.length();
                score += score1;
            }
            System.out.printf("New hole reached! Hits so far: %d\n", counter);
            score = 0;
            score1 = 0;
            sum = 0;
            sum1 = 0;
            counter++;



        }
        if(counterall<=record){
        System.out.printf("Yes, you won! Total hits: %.0f", counterall);}
        else{
            System.out.printf("Better luck next time... Total hits: %.0f", counterall);
        }
    }
}
