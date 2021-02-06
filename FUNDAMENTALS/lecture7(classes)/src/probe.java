import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class probe {
    static class Lecture {
        String name;
        int day;
        Lecture(String name, int day){
            this.name=name;
            this.day=day;

        }
        Lecture(){
            this.name="unknown";
            this.day=-1;

        }

        public String getName() {
            return name;
        }
        public Integer getDay() {
            return day;
        }

        @Override
        public String toString() {
            return this.getName()+" "+this.getDay();
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    static class LectureChangeDays {
        String name;
        int day;
       void moveToNextWeek()
        {day+=7;
        if(day>365)
        {day-=365;}}

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Lecture todaylecture= new Lecture("Ivan", 286);
        //System.out.println(todaylecture.getName()+" "+todaylecture.getDay());
        //System.out.println(todaylecture);
        List<Lecture> lectures=new ArrayList<>();
        int lectureNum=scanner.nextInt();
        for (int i = 0; i <lectureNum ; i++) {
            String name=scanner.next();
            int day=scanner.nextInt();
            Lecture current=new Lecture();
            current.name=name;
            current.day=day;
            lectures.add(current);
        }
        int searchday=scanner.nextInt();
        Lecture found=null;
        for (Lecture lecture : lectures) {
            if(searchday==lecture.day)
           found=lecture;
        }
        if(found!=null)
        {
           System.out.println(found.name+" "+found.day);
        }
        else
        {
            System.out.println("No lecture on that day");
        }
    }
}
