import java.util.Scanner;

public class leftrightsum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        int leftsum=0;
        for(int i=0;i<n ;i++){
        leftsum+=Integer.parseInt(scanner.nextLine());}
        int rightsum=0;
        for(int i=0;i<n ;i++){
            rightsum+=Integer.parseInt(scanner.nextLine());}
        if(rightsum==leftsum){
            System.out.println("Yes, sum = "+leftsum);
        }
        else{
            int diff= Math.abs(leftsum-rightsum);
            System.out.println("No, diff = "+diff);}
    }
}
