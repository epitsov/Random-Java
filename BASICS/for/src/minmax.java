import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
        int x=Integer.parseInt(scanner.nextLine());
        if(x<min)
        {min=x;}
        if(x>min)
        {max=x;}
       }
        System.out.printf("Max number: %d%nMin number: %d",max,min);
        }

    }

