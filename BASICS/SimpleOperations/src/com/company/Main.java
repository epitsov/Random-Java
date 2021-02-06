package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double x= Double.parseDouble(scanner.nextLine());
        double usd=1.79549;
        double s=x*usd;
        System.out.printf("%.2f",s);
    }
}
