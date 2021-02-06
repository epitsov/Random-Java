import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot("ivan");
        List<String> myList = new ArrayList<>();
        robot.name = "Ivan";
        System.out.println( robot.name );
        System.out.println( robot.serialNum );
    }
}
