import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list1 = scanner.nextLine().split("\\s+");
        String[] list2 = scanner.nextLine().split("\\s+");
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            numbers1.add(Integer.parseInt(list1[i]));
        }
        for (int i = 0; i < list2.length; i++) {
            numbers2.add(Integer.parseInt(list2[i]));
        }
        int specialnum = numbers2.get(0);
        int power=numbers2.get(1);
        int index=0;
        for (int i = 0; i <numbers1.size() ; i++) {
            if(specialnum==numbers1.get(i))
            {index=i;}
        }
        if(index+power<=numbers1.size()-1){
        for (int i = index; i <index+power ; i++) {
            numbers1.remove(i+1);

        }}
        else
        {   for (int i = index; i <numbers1.size() ; i++) {
            numbers1.remove(i+1);

        }}
        for (int i = index; i >=index-power ; i--) {
            numbers1.remove(i);

        }
        int sum=0;
        for (int i = 0; i <numbers1.size() ; i++) {
            sum+=numbers1.get(i);
        }
        System.out.println(sum);

    }
}
