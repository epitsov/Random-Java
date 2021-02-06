import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] first1 = scanner.nextLine().split("\\s+");
        List<Integer> second = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        String[] second2 = scanner.nextLine().split("\\s+");
        for (int i = 0; i < first1.length; i++) {
            first.add(Integer.parseInt(first1[i]));
        }
        for (int i = 0; i < second2.length; i++) {
            second.add(Integer.parseInt(second2[i]));
        }
        List<Integer> merged = new ArrayList<>();
        int maxsize = Math.max(first.size(), second.size());
         for (int i = 0; i <maxsize ; i++) {
          if(i<first.size()) {
             merged.add(first.get(i));
          }
         if(i<second.size()) {
             merged.add(second.get(i));
          }}
         // sort the merged list:
        //while (!first.isEmpty() || !second.isEmpty()) {
           // if (first.isEmpty()) {
            //    merged.add(second.remove(0));
            //} else if (second.isEmpty()) {
              //  merged.add(first.remove(0));
          //  } else {
             //   if (first.get(0) < second.get(0)) {
              //      merged.add(first.remove(0));
             //   } else {
              //      merged.add(second.remove(0));
            //    }
        //    }
      //  }
        for (Integer x : merged) {
            System.out.print(x + " ");
        }
    }
}
