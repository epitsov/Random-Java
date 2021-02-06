import java.util.Scanner;

public class commision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String town= scanner.nextLine();
        double volume=Double.parseDouble(scanner.nextLine());
        double com=0.0;
        if(town.equals("Sofia")) {
            if (volume >= 0 && volume <= 500) {
                com=volume*0.05;
            } else if (volume > 500 && volume <= 1000) {
                com=volume*0.07;
            } else if (volume > 1000 && volume <= 10000) {
                com=volume*0.08;
            } else {
                com=volume*0.12;
            }
        }
        else if(town.equals("Varna"))
        {
            if (volume >= 0 && volume <= 500) {
                com=volume*0.045;
            } else if (volume > 500 && volume <= 1000) {
                com=volume*0.075;
            } else if (volume > 1000 && volume <= 10000) {
                com=volume*0.1;
            } else if (volume > 100000) {
                com=volume*0.13;
            }
        }
        else if(town.equals("Plovdiv")){
            if (volume >= 0 && volume <= 500) {
                com=volume*0.055;
            } else if (volume > 500 && volume <= 1000) {
                com=volume*0.08;
            } else if (volume > 1000 && volume <= 10000) {
                com=volume*0.12;
            } else {
                com=volume*0.145;
            }
        }
        if(com>0)
        {System.out.printf("%.2f",com);}
        else
        {
            System.out.println("error");}
    }
}
