import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, List<String>> courses=new LinkedHashMap<>();
        String input=scanner.nextLine();
        while(!"end".equals(input))
        {String [] tokens=input.split(" : ");
        String coursename=tokens[0];
        String student=tokens[1];
        if(!courses.containsKey(coursename))
        {courses.put(coursename,new LinkedList<>());
        courses.get(coursename).add(student);}
        else{
            courses.get(coursename).add(student);
        }

            input=scanner.nextLine();}
        courses.entrySet()
                .stream()
                .sorted((a,b)->b.getValue().size()-a.getValue().size())
        .forEach(entry-> {System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
        entry
                .getValue()
                .stream()
                .sorted((a,b)->a.compareTo(b))
                .forEach(s-> System.out.println("-- "+s));
        });
    }

}
