package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x= Integer.parseInt(scanner.nextLine());
        int y= Integer.parseInt(scanner.nextLine());
        int z= Integer.parseInt(scanner.nextLine());
        int totaltime=x+y+z;
        double min=totaltime/60;
        double sec=totaltime%60;
        if (sec<10)
        {
        System.out.printf("%.0f:0%.0f",min,sec);}
        else{
        System.out.printf("%.0f:%.0f",min,sec);}


    }
}
