import java.util.Scanner;

public class pcshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double counterheart = 0;
        double counterfort = 0;
        double counterover = 0;
        double counterother = 0;
        for (int i = 0; i < n; i++) {
            String inp = scanner.nextLine();
            if (inp.equals("Hearthstone")) {
                counterheart++;
            }
            else if (inp.equals("Fornite")) {
                {
                    counterfort++;
                }
            }
            else if (inp.equals("Overwatch")) {
                {
                    counterover++;
                }
            } else {
                {
                    counterother++;
                }

            }
        }

        System.out.printf("Heartstone - %.2f%%\n",(counterheart/n)*100);
        System.out.printf("Fortnite - %.2f%%\n",(counterfort/n)*100);
        System.out.printf("Overwatch - %.2f%%\n",(counterover/n)*100);
        System.out.printf("Others - %.2f%%\n",(counterother/n)*100);

    }}