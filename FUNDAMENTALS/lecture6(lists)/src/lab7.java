import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] inp=scanner.nextLine().split("\\s+");
        List<Integer> nums=new ArrayList<>();
        for (int i = 0; i <inp.length ; i++) {
            nums.add(Integer.parseInt(inp[i]));
        }
        for (int i = 0; i <nums.size() ; i++) {
            if (nums.get(i)<0)
            {nums.remove(i);
            i=0;}
        }
        if(nums.size()==1&&nums.get(0)<0)
        {nums.remove(0);
            System.out.println("empty");}
        for (int i = nums.size()-1; i >=0 ; i--) {
            System.out.print(nums.get(i)+ " ");
        }

    }
}
