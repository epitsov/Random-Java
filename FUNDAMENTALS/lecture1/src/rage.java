import java.util.Scanner;

public class rage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameslost = Integer.parseInt(scanner.nextLine());
        double headsetprice=Double.parseDouble(scanner.nextLine());
        double mouseprice=Double.parseDouble(scanner.nextLine());
        double keyprice=Double.parseDouble(scanner.nextLine());
        double displayprice=Double.parseDouble(scanner.nextLine());
        int headsetbroken = 0;
        int mousebroke=0;
        double displaybroken=0;
        boolean keyboardbroken = false;
        double brokentimes = 0;
        for (int i = 2; i <= gameslost; i += 2) {
        headsetbroken++;}
        for (int u = 3; u <= gameslost; u += 3) {
        mousebroke++;}

        for (int i = 2; i <= gameslost; i += 2) {
            {
                for (int u = 3; u <= gameslost; u += 3) {
                    if (i == u) {
                        keyboardbroken = true;
                        brokentimes++;
                    }
                }
            }}
if(brokentimes%2==0)
{displaybroken=brokentimes/2;}
else{displaybroken=Math.floor(brokentimes/2);}
double sum=headsetprice*headsetbroken+mousebroke*mouseprice+brokentimes*keyprice+displaybroken*displayprice;
        System.out.printf("Rage expenses: %.2f lv.",sum);}
    }
