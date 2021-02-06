import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[][] field = new int[15][15];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = 0;
            }
        }
        int[] playerposition = new int[2];
        playerposition[0] = 7;
        playerposition[1] = 7;

        double damage = Double.parseDouble( scanner.nextLine() );
        int playerHealth = 18500;
        double bossHealth = 3000000.0;
        boolean cloudHit = false;
        double currentdamage = 0;
        boolean playerIsDead = false;
        boolean bossIsDead = false;
        boolean deathFromPlague = false;
        String currentCommand = "";
        while (true) {
            if (cloudHit == true) {
                playerHealth -= 3500;
                cloudHit = false;
            }
            String input = scanner.nextLine();
            currentCommand = input;
            String[] command = input.split( " " );
            String spell = command[0];
            int row = Integer.parseInt( command[1] );
            int col = Integer.parseInt( command[2] );
            if (playerHealth < 0) {
                deathFromPlague = true;
                playerIsDead = true;
                bossHealth -= damage;
                break;
            }
            if (spell.equals( "Cloud" )) {
                if (playerWillBeHit( row, col, playerposition )) {
                    returnPlayerPosition( field, playerposition, row, col );
                    bossHealth -= damage;
                } else {
                    playerHealth -= 3500;
                    bossHealth -= damage;
                    cloudHit = true;
                    currentdamage = 3500;
                }
            } else {
                if (playerWillBeHit( row, col, playerposition )) {

                    returnPlayerPosition( field, playerposition, row, col );
                    bossHealth -= damage;
                } else {
                    playerHealth -= 6000;
                    bossHealth -= damage;
                    currentdamage = 6000;
                }
            }
            if (bossHealth < 0) {
                bossIsDead = true;
                break;
            }
            if (bossHealth < 0 && playerWillBeHit( row, col, playerposition )) {
                playerHealth += currentdamage;
                bossIsDead = true;

                break;
            }
            if (playerHealth < 0) {
                playerIsDead = true;
                break;
            }

        }
        String[] input = currentCommand.split( " " );
        if (playerIsDead) {
            if (deathFromPlague) {
                System.out.println( String.format( "Heigan: %.2f", bossHealth ) );
                System.out.println( "Player: Killed by Plague Cloud" );
                System.out.println( String.format( "Final position: %s, %s", input[1], input[2] ) );
            } else {
                System.out.println( String.format( "Heigan: %.2f", bossHealth ) );
                System.out.println( String.format( "Player: Killed by %s", input[0] ) );
                System.out.println( String.format( "Final position: %s, %s", input[1], input[2] ) );
            }
        } else {
            System.out.println( "Heigan: Defeated!" );
            System.out.println( String.format( "Player: %d", playerHealth ) );
            System.out.println( String.format( "Final position: %s, %s", input[1], input[2] ) );
        }
    }


    private static boolean playerWillBeHit(int row, int col, int[] playerposition) {
        boolean x = false;
        int[][] newField = new int[15][15];
        for (int i = Math.max( row - 1, 0 ); i <= Math.min( row + 1, 14 ); i++) {
            for (int j = Math.max( col - 1, 0 ); j <= Math.min( col + 1, 14 ); j++) {
                newField[i][j] = 1;
            }
        }
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (newField[playerposition[0] + i][playerposition[1] + j] == 1) {
                    x = true;
                    break;
                }
            }
            if (x) {
                break;
            }
        }
        if (x && canEscape( newField, playerposition ) == false) {
            return false;
        }
        return true;
    }

    private static int[] returnPlayerPosition(int[][] field, int[] playerposition, int row, int col) {
        for (int i = Math.max( row - 1, 0 ); i <= Math.min( row + 1, 14 ); i++) {
            for (int j = Math.max( col - 1, 0 ); j <= Math.min( col + 1, 14 ); j++) {
                field[i][j] = 1;
            }
        }
        if (field[Math.max( playerposition[0] - 1, 0 )][playerposition[1]] != 1) {
            playerposition[0] = Math.max( playerposition[0] - 1, 0 );
            return playerposition;

        }
        if (field[playerposition[0]][Math.min( playerposition[1] + 1, 13 )] != 1) {
            playerposition[1] = Math.min( playerposition[1] + 1, 13 );
            return playerposition;
        }
        if (field[Math.min( 13, playerposition[0] + 1 )][playerposition[1]] != 1) {
            playerposition[0] = Math.min( playerposition[0] + 1, 13 );
            return playerposition;
        }
        if (field[Math.max( 0, playerposition[0] )][Math.min( playerposition[1] - 1, 13 )] != 1) {
            playerposition[1] = Math.min( playerposition[1] - 1, 13 );
            return playerposition;
        }
        return playerposition;
    }

    private static boolean canEscape(int[][] field, int[] playerposition) {
        if (field[Math.max( playerposition[0] - 1, 0 )][playerposition[1]] != 1) {
            return true;
        }
        if (field[playerposition[0]][Math.min( playerposition[1] + 1, 14 )] != 1) {
            return true;
        }
        if (field[Math.max( 0, playerposition[0] + 1 )][playerposition[1]] != 1) {
            return true;
        }
        if (field[playerposition[0]][Math.max( playerposition[1] - 1, 0 )] != 1) {
            return true;
        }
        return false;
    }
}

