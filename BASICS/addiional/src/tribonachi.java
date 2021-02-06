import java.util.Scanner;

public class tribonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int f = Integer.parseInt(scanner.nextLine());
        int currentnumber = c;
        int secondnumber=0;
        int cv=f;
        int steps=0;
        while (currentnumber < 1000000) {
            currentnumber = a + b + c;
            a = b;
            b = c;
            c = currentnumber;
            secondnumber=d;

            while (secondnumber<1000000) {
                if(secondnumber==currentnumber)
                {
                    System.out.println(currentnumber);
                }
              if(steps%2==0&&steps!=0)
              {f+=cv;}
                secondnumber+=f;
              steps++;

              if(secondnumber==currentnumber)
              {
                  System.out.println(currentnumber);
              }

            }
           secondnumber=0;
            f=cv;
            steps=0;
        }


        }
    }

