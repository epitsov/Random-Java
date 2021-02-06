import java.util.Scanner;

public class graduation2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name= scanner.nextLine();
        int grade=1;
        double note=0.0;
        while(grade<=12)
        {double note1=Double.parseDouble(scanner.nextLine());
        if (note1<=4)
        {   double note2=Double.parseDouble(scanner.nextLine());
        if(note2<=4&&note1<=4)
            System.out.printf("%s has been excluded at %d grade",name,grade);
            }
        else{
        note+=note1;
        grade++;}
  }
        if(grade>=12){
        System.out.printf("%s graduated. Average grade: %.2f",name,note/12);}
}}
