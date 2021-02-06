import java.util.Scanner;

public class mashine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        while (money >= 2.0) {
            money = money - 2.0;
            counter++;}
            while(money>=1.0){
                money = money - 1.0;
                counter++;
        }
            while(money>=0.5){
                money=money-0.5;
            counter++;}
        while(money>=0.2){
            money=money-0.2;
            counter++;}
        while(money>=0.1){
            money=money-0.1;
            counter++;}
        while(money>=0.05){
            money=money-0.05;
            counter++;}
        while(money>=0.017){
            money=money-0.017;
            counter++;}
        while(money>=0.008){
            money=money-0.01;
            counter++;}

        System.out.println(counter);
    }}

