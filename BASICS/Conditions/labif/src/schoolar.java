import java.util.Scanner;

public class schoolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lev = Double.parseDouble(scanner.nextLine());
        double oc = Double.parseDouble(scanner.nextLine());
        double sel = Double.parseDouble(scanner.nextLine());
        if (oc >= 5.5) {
            double zap = Math.floor(25 * oc);
            double z=Math.floor(sel*0.35);
            if(lev<sel){
            if (zap<=z)
            {
                System.out.printf("You get a Social scholarship %.0f BGN",z);
            }
            else{
                System.out.printf("You get a scholarship for excellent result of %.0f BGN",zap);
            }}
            else{
                System.out.printf("You get a scholarship for excellent result of %.0f BGN",zap);
        }}
        else if (oc > 4.5)
            if (lev < sel) {
                double c = sel * 0.35;
                System.out.printf("You get a Social scholarship %.0f BGN",c);
            }
            else {
                System.out.println("You cannot get a scholarship!");
            }
        else if (oc < 4.5) {
            System.out.println("You cannot get a scholarship!");



        }
    }}