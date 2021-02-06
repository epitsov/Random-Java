import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Map<String, Integer> comments = new HashMap<>();
        Map<String, Integer> likes = new HashMap<>();
        Scanner scanner = new Scanner( System.in );
        String input = scanner.nextLine();
        while (!"Log out".equals( input )) {
            String[] tokens = input.split( ": " );
            String command = tokens[0];
            String username = tokens[1];
            switch (command) {
                case "New follower":
                    comments.putIfAbsent( username, 0 );
                    likes.putIfAbsent( username, 0 );
                    break;
                case "Like":
                    Integer currentLikes = likes.get( username );
                    int newLikes = Integer.parseInt( tokens[2] );
                    if (currentLikes != null) {
                        likes.put( username, currentLikes + newLikes );
                    } else {
                        likes.put( username, newLikes );
                        comments.put( username, 0 );
                    }
                    break;
                case "Comment":
                    Integer currentComments = comments.get( username );
                    if (currentComments != null) {
                        comments.put( username, currentComments + 1 );
                    } else {
                        likes.put( username, 0 );
                        comments.put( username, 1 );
                    }
                    break;
                case "Blocked":
                    if (comments.containsKey( username )) {
                        likes.remove( username );
                        comments.remove( username );
                    } else {
                        System.out.println( String.format( "%s doesn't exist.", username ) );
                    }
                    break;


            }


            input = scanner.nextLine();
        }
        System.out.println( String.format( "%d followers", likes.size() ) );
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

