import java.util.Scanner;

public class equalsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = x; i <= y; i++) {
            String lenght = i + "";
            int lenght1 = lenght.length() - 1;
            int lenght2 = lenght1 - 2;
            char op = lenght.charAt(2);
            int middlenumber = Integer.parseInt("" + op);
            for (int o = 0; o < lenght2; o++) {
                char z = lenght.charAt(o);
                int numveratzZ = Integer.parseInt("" + z);
                sum1 += numveratzZ;

            }
            for (int l = lenght2 + 1; l <= lenght1; l++) {
                char v = lenght.charAt(l);
                int numveratzV = Integer.parseInt("" + v);
                sum2 += numveratzV;
            }

            if (sum1 == sum2) {
                System.out.println(i);
            } else if (sum1 > sum2) {
                sum2 += middlenumber;
                if (sum1 == sum2)
                    System.out.println(i);
                    else sum1=0;
                    sum2=0;


            } else if (sum1 < sum2) {
                sum1 += middlenumber;
                if (sum1 == sum2)
                    System.out.println(i);
               else sum1=0;
                sum2=0;
                }
            }



        }

    }


