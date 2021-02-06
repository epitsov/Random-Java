import java.util.Scanner;

public class magicdates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year1= Integer.parseInt(scanner.nextLine());
        int year2= Integer.parseInt(scanner.nextLine());
        int weight= Integer.parseInt(scanner.nextLine());
        int counterdays=1;
        int countermonths=1;
        String x="";
        int counteryears=year1;
        while(year1<=year2)
        { x=""+counterdays+countermonths+year1;
        ///вече знаеш как изглежда числото просто сега с цикъл и
            /// чарат обходи цикълла и намери тежеста
            counterdays++;
        if(counterdays>=31)
        {counterdays=0;
            countermonths++;}
        if (countermonths>=12)
        {counteryears++;}
        }

        }


}
