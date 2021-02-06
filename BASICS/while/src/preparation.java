import java.util.Scanner;

public class preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failedthereshold = Integer.parseInt(scanner.nextLine());
        double gradesum = 0.0;
        boolean isfailed = true;
        int solvedproblem=0;
        int failedtimes = 0;
        String lastproblem="";
        while (failedtimes < failedthereshold)
        {String problemName= scanner.nextLine();
        if(problemName.equals("Enough"))
        {isfailed=false;
        break;
        }
        int grade=Integer.parseInt(scanner.nextLine());
        if(grade<=4)
        {failedtimes++;}
            gradesum+=grade;
        solvedproblem++;
        lastproblem=problemName;
        }
        if(isfailed) {
            System.out.printf("You need a break, %d poor grades.", failedthereshold);
        }else
        {
            System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s",gradesum/solvedproblem,solvedproblem,lastproblem);

        }
        }

    }