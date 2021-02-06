import java.io.*;
import java.util.ArrayList;
@SuppressWarnings( "unchecked" )
public class serializeArray {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add( i );
        }
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("demo.ser") );
        objectOutputStream.writeObject( numbers );
        ObjectInputStream inputStream=new ObjectInputStream( new FileInputStream( "demo.ser" ) );
       // ArrayList<Integer> numberTwo=(ArrayList<Integer>) inputStream.readObject();
    }
}
