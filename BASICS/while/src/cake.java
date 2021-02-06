import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int piecesleft=0;
        while (piecesleft < x * y) {
            String pieces = scanner.nextLine();
            if (!pieces.equals("STOP")) {
                int pieceseaten = Integer.parseInt(pieces);
                piecesleft+=pieceseaten;
            } else {
                break;
            }
        }
        if(piecesleft>x*y){
            System.out.printf("No more cake left! You need %d pieces more.",piecesleft-x*y);
        }
        else{
            System.out.printf("%d pieces are left",x*y-piecesleft);
        }
    }
}

