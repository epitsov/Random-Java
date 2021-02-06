import java.util.Scanner;

public class trainthetrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String x = "";
        double sum = 0;
        int counter=0;
        int counter1=0;
        double finalassesment=0;
        while (!x.equals("Finish")) {
            x=scanner.nextLine();
            if(x.equals("Finish"))
            {break;}
            for (int i = 0; i < n; i++) {

                Double note = Double.parseDouble(scanner.nextLine());
                sum += note;
                counter++;

            }

            counter1++;
            double avarage=(sum/counter);
            finalassesment+=avarage;
            System.out.printf(x+" - %.2f. \n",avarage);
            sum=0;
            counter=0;

        }
        double avarage1= finalassesment/counter1;
        System.out.printf("Student's final assessment is %.2f. ",avarage1);


    }
}
