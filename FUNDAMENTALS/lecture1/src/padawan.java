import java.util.Scanner;

public class padawan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double money= Double.parseDouble(scanner.nextLine());
        int students= Integer.parseInt(scanner.nextLine());
        double pricesword=Double.parseDouble(scanner.nextLine());
        double pricerobes=Double.parseDouble(scanner.nextLine());
        double pricebelts=Double.parseDouble(scanner.nextLine());
        double sum=0;
        int freebelts=0;
        if(students>=6)
        {freebelts=students/6;}
        sum=pricesword*Math.ceil(students*1.1)+pricerobes*students
                + pricebelts*(students-freebelts);
    }
}
