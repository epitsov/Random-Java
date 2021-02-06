import java.util.Scanner;

public class cookingfactorz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int batch = Integer.parseInt(scanner.nextLine());
        boolean flour = false;
        boolean eggs = false;
        boolean sugar = false;
        int batchnumber = 0;
        for (int i = 0; i < batch; i++) {
            String ing = "";
            while (!eggs || !flour || !sugar) {
                ing = scanner.nextLine();
                if (ing.equals("flour")) {
                    flour = true;

                } else if (ing.equals("eggs")) {
                    eggs = true;

                } else if (ing.equals("sugar")) {
                    sugar = true;
                } else if (ing.equals("Bake!")) {
                }
                if (sugar && eggs && flour) {
                    break;
                }}
                if (sugar && eggs && flour) {
                    batchnumber++;
                    System.out.printf("Baking batch number %d...%n", batchnumber);
                }
             else {
                System.out.println("The batter should contain flour, eggs and sugar!");
            }

        }

    }


}
