import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String Name=scanner.nextLine();
        int grade=1;
        double totalgrade=0.0;

        while(grade<=12) {
        double grades= Double.parseDouble(scanner.nextLine());
        if(grades>=4) {
            totalgrade += grades;
            grade++;
        }        }
        double avgGrade=totalgrade/12;
        System.out.printf("%s graduated. Average grade: %.2f",Name,avgGrade);
    }
}
