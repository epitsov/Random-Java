import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String skill = scanner.nextLine();
        String commands = scanner.nextLine();
        while (!"For Azeroth".equals( commands )) {
            String[] tokens = commands.split( " " );
            String command = tokens[0];
            switch (command) {
                case "GladiatorStance":
                    skill = skill.toUpperCase();
                    System.out.println( skill );
                    break;
                case "DefensiveStance":
                    skill = skill.toLowerCase();
                    System.out.println( skill );
                    break;
                case "Dispel":
                    int index = Integer.parseInt( tokens[1] );
                    String lett = tokens[2];
                    if (index > 0 && index < skill.length()) {
                        skill = skill.replace( skill.charAt( index ), lett.charAt( 0 ) );
                        System.out.println( "Success!" );
                    } else {
                        System.out.println( "Dispel too weak." );
                    }
                    break;
                case "Target":
                    String secondCommand = tokens[1];
                    if (secondCommand.equals( "Change" )) {
                        String substring = tokens[2];
                        String second = tokens[3];
                        skill = skill.replace( substring, second );
                        System.out.println( skill );
                    } else {
                        String substring = tokens[2];
                        String skillBefore = skill.substring( 0, skill.indexOf( substring ) );
                        String skilAfter=skill.substring( skill.indexOf( substring ) +substring.length());
                        skill=skillBefore+skilAfter;
                        System.out.println(skill);

                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");


            }

            commands = scanner.nextLine();
        }
    }
}
