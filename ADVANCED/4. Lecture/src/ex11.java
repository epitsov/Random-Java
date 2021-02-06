import java.io.*;

public class ex11 {
    public static class Course implements Serializable {
        private String name;
        private int students;

        public Course(String name, int students) {
            this.name = name;
            this.students = students;
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Course course = new Course( "Java-Advanced", 10000 );
        ObjectOutputStream objectOutputStream = new ObjectOutputStream( new FileOutputStream( "demo.ser" ) );
        objectOutputStream.writeObject( course );
        ObjectInputStream inputStream = new ObjectInputStream( new FileInputStream( "demo.ser" ) );
         Course numberTwo=(Course) inputStream.readObject();
        System.out.println(numberTwo.name);
        System.out.println(numberTwo.students);
    }

}

