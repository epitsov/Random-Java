import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex3OOP {
    public static void main(String[] args) {
        Map<String, User> usernames = new HashMap<>();

        Scanner scanner = new Scanner( System.in );
        String input = scanner.nextLine();
        while (!"Log out".equals( input )) {
            String[] tokens = input.split( ": " );
            String command = tokens[0];
            String username = tokens[1];
            switch (command) {
                case "New follower":{
                    User user=new User( 0,0 );
                    usernames.putIfAbsent(username,user);
                    break;}
                case "Like":{
                    int newLikes = Integer.parseInt( tokens[2] );
                    if (usernames.containsKey( username )) {
                       User user=usernames.get( username );
                       user.addLikes( newLikes );
                    } else {
                        User user=new User( newLikes,0 );
                        usernames.put( username,user );
                    }
                    break;}
                case "Comment":{

                    if (usernames.containsKey( username )) {
                        User user=usernames.get( username );
                        user.increaseComments(  );
                    } else {
                        User user=new User( 0,0 );
                        usernames.put( username,user );
                    break;}}
                case "Blocked":
                    if (usernames.containsKey( username )) {

                        usernames.remove( username );
                    } else {
                        System.out.println( String.format( "%s doesn't exist.", username ) );
                    }
                    break;


            }


            input = scanner.nextLine();
        }
        System.out.println( String.format( "%d followers", usernames.size() ) );
        //likes.entrySet().stream()
        //   .sorted( (a, b) ->
        //    {
        //     int result = b.getValue().compareTo( a.getValue() );
        //    if (result == 0) {
        //      result = a.getKey().compareTo( b.getKey() );
        //   }
        //   return result;
        //   } )
        //   .forEach
        //          ( entry-> System.out.println(String.format( "%s: %d" ,entry.getKey(),entry.getValue()+comments.get(entry.getKey()))));
    }
}

