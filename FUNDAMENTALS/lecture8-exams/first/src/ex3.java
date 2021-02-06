import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pirateschipsection = readShipSection(scanner);
        int[] enemyshipsection = readShipSection(scanner);
        int maxhealth=Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean piratesShipSunk = false;
        boolean enemyShipSunk = false;
        while (!command.equals("Retire")) {
            String[] parts = command.split(" ");
            String type = parts[0];
            switch (type) {
                case "Fire": {
                    int index = Integer.parseInt(parts[1]);
                    int damage = Integer.parseInt(parts[2]);
                    if (isValidIndex(index, enemyshipsection)) {
                        enemyshipsection[index] -= damage;
                        if (enemyshipsection[index] <= 0) {
                            enemyShipSunk = true;
                            break;
                        }
                    }

                    break;
                }
                case "Defend": {
                    int fromindex = Integer.parseInt(parts[1]);
                    int toindex = Integer.parseInt(parts[2]);
                    int damage = Integer.parseInt(parts[3]);
                    if (isValidIndex(fromindex, pirateschipsection) && isValidIndex(toindex, pirateschipsection)) {
                        for (int index = fromindex; index <= toindex; index++) {


                            enemyshipsection[index] -= damage;
                            if (enemyshipsection[index] <= 0) {
                                piratesShipSunk = true;
                                break;
                            }
                        }
                        if(piratesShipSunk)
                        {break;}
                        break;
                    }
                }
                case "Repair": {
                     int index = Integer.parseInt(parts[1]);
                    int repair = Integer.parseInt(parts[2]);
                    if (isValidIndex(index, enemyshipsection)) {
                        pirateschipsection[index] += repair;
                        if(pirateschipsection[index]>maxhealth)
                        {pirateschipsection[index]=maxhealth;}
                    }
                    break;
                }
                case "Status": {
                    int count=0;
                    for (int section : pirateschipsection) {
                        if(section<0.2*maxhealth){
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n",count);
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if (piratesShipSunk) {
            System.out.println("You won! The enemy ship has sunken.");
        } else if (enemyShipSunk) {
            System.out.println("You won! The enemy ship has sunken.");
        } else {
            System.out.printf("Pirate ship status: %d%n", getShipStatus(pirateschipsection));
            System.out.printf("Warship status: %d%n", getShipStatus(enemyshipsection));
        }
    }



    private static int getShipStatus(int[] shipsections) {
        int sum = 0;
        for (int section : shipsections) {
            sum += section;
        }
        return sum;
    }

    private static int[] readShipSection(Scanner scanner) {
        String[] parts = scanner.nextLine().split(">");
        int[] ship = new int[parts.length];
        for (int i = 0; i < ship.length; i++) {
            ship[i] = Integer.parseInt(parts[i]);
        }
        return ship;

    }


    private static boolean isValidIndex(int index, int[] array) {
        return index >= 0 && index < array.length;
    }
}