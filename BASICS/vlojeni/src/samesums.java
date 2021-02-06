import java.util.Scanner;

public class samesums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int sumodd=0;
        int sumeven=0;
        for (int i = x; i <= z; i++) {
            String v = "" + i;
            int y = v.length() - 1;
            for (int u = 0; u <= y; u +=2) {
                char numberatu = v.charAt(u);
                int numberAtu=Integer.parseInt(""+numberatu);
                 sumodd=sumodd+numberAtu;
            }
            for(int j=1;j<=y;j+=2) {
                char numberatj = v.charAt(j);
                int numberAtj=Integer.parseInt(""+numberatj);
                sumeven+=numberAtj;}
            if(sumeven==sumodd)
            {
                System.out.print(i+" ");
            }
            else{sumeven=0;
            sumodd=0;}
            }

        }
    }

