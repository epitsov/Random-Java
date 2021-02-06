import java.util.Scanner;

public class graduation21 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String student=scan.nextLine();
        double totalgrade=0;
        int classcount=1;
        int expellcount=0;
        boolean isexpelled=false;
        while(classcount<=12)
        {double grade= Double.parseDouble(scan.nextLine());
        if (grade>=4)
        {
            classcount++;
            totalgrade+=grade;
        }
        else{expellcount++;}
        if(expellcount==2)
        {isexpelled=true;}}
        if(isexpelled)
        {
            System.out.printf("%s has been excluded at %d grad",student,classcount);
        }
        else {
            System.out.printf("%s graduated. Average grade: %.2f", student,totalgrade/12);
        }
        }
    }
