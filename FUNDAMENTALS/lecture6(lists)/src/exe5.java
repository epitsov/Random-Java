import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bombinfo= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int bombnumber=bombinfo.get(0);
        int power=bombinfo.get(1);
        while(list.contains(bombnumber)) {
            int bombposition=list.indexOf(bombnumber);
            int leftbound=Math.max(0,bombposition-power);
            int rightbound=Math.min(list.size()-1,bombposition+power);
            for (int i = rightbound; i >=leftbound ; i--) {
                list.remove(i);
            }}
            int sum=0;
            for (int i = 0; i <list.size() ; i++) {
                sum+=list.get(i);
            }
            System.out.println(sum);


        }
        }


