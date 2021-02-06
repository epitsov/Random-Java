import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab6 {
    static class Student {
        String firstName;
        String secondName;
        int age;
        String town;


        public void setfirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setsecondName(String secondName) {
            this.secondName = secondName;

        }

        public void setAge(int age) {
            this.age = age;

        }
        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.town = town;
        }

        public String getCity() {
            return town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public Integer getAge() {
            return age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Student> students = new ArrayList<>();
        while (!input[0].equals("end")) {
            String firstName = input[0];
            String secondName = input[1];
            int age = Integer.parseInt(input[2]);
            String town = input[3];
            if (studentExisting(students, firstName, secondName)) {
                Student student=getStudent(students,firstName,secondName,age,town);
            } else {
                Student student = new Student(firstName, secondName, age, town);
            students.add(student);}


                input = scanner.nextLine().split(" ");
            }

        String filtercity = scanner.nextLine();
        for (Student student : students) {
            if (student.getCity().equals(filtercity)) {
                System.out.printf("%s %s is %d years \n",
                        student.getFirstName(), student.getSecondName(), student.getAge());
            }
        }

    }

    private static Student getStudent(List<Student> students, String firstName, String secondName, int age, String town) {
        Student existingStudent = null;
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.secondName.equals(secondName)) {
                existingStudent = student;
                existingStudent.age = age;
                existingStudent.town = town;
            }
        }
        return existingStudent;}

    private static boolean studentExisting(List<Student> students, String firstName, String secondName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.secondName.equals(secondName)) {
                return true;
            }
        }
        return false;}
}