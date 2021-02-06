import java.util.Scanner;

public class convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x = Double.parseDouble(scanner.nextLine());
        String z= scanner.nextLine();
        String u= scanner.nextLine();

        if (z.equals("mm"))
        if (u.equals("m")){
        double c= x/1000;
            System.out.printf("%.3f",c);
        }
        if (z.equals("m"))
            if (u.equals("cm")){
                double c= x*(100);
                System.out.printf("%.3f",c);
            }
        if (z.equals("cm"))
            if (u.equals("mm")){
                double c= x*(10);
                System.out.printf("%.3f",c);
            }
        if (z.equals("mm"))
            if (u.equals("cm")){
                double c= x/(10);
                System.out.printf("%.3f",c);
            }
        if (z.equals("cm"))
            if (u.equals("m")){
                double c= x/(100);
                System.out.printf("%.3f",c);
            }
        if (z.equals("m"))
            if (u.equals("mm")){
                double c= x*(1000);
                System.out.printf("%.3f",c);
            }

    }}
