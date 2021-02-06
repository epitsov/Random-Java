import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab5 {
    static class Student {
        String firstName;
        String secondName;
        int age;
        String town;



        public void setfirstName(String firstName) {
            this.firstName=firstName;
        }

        public void setsecondName(String secondName) {
            this.secondName=secondName;

        }

        public void setAge(int age) {
            this.age=age;

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
            this.town=town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Student> students=new ArrayList<>();
        while (!input[0].equals("end")) {
            String firstName=input[0];
            String secondName=input[1];
            int age=Integer.parseInt(input[2]);
            String town=input[3];
            Student currentstudent=new Student();
            currentstudent.setfirstName(firstName);
            currentstudent.setsecondName(secondName);
            currentstudent.setAge(age);
            currentstudent.setTown(town);
            students.add(currentstudent);

            input = scanner.nextLine().split(" ");
        }
        String filtercity=scanner.nextLine();
        for (Student student : students) {
            if(student.getCity().equals(filtercity))
            {
                System.out.printf("%s %s is %d years \n",
                        student.getFirstName(),student.getSecondName(),student.getAge());
            }
        }

    }
}
