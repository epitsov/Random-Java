import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lectureCount = Integer.parseInt(scanner.nextLine());
        int initialbonus = Integer.parseInt(scanner.nextLine());
        double maxvalue = Integer.MIN_VALUE;
        int lecturesattended=0;
        for (int i = 0; i < studentsCount; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());

            double studentScore = Math.ceil(((0.0 + studentAttendance) / lectureCount + 0.0) * (5.0 + initialbonus));
            if (studentScore > maxvalue) {
                maxvalue = studentScore;
                lecturesattended=studentAttendance;
            }

        }
        System.out.printf("Max Bonus: %.0f.%n",maxvalue);
        System.out.printf("The student has attended %d lectures.",lecturesattended);
    }
}
