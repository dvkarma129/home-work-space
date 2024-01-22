 package array_programs;

 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.List;

 public class countPairsWhoseSumIsLessThenTarget {

     public static void main(String[] args) {
         // int[] list = { -1, 1, 2, 3, 1 };
         List <Integer> list = new ArrayList<>(Arrays.asList(-1, 1, 2, 3, 1 ));
         int target = 2;

         int count = 0;
         for (int i = 0; i < list.size(); i++) {
             for (int j = i + 1; j < list.size(); j++) {
                 if (list.get(i) + list.get(j) < target) {
                     count++;
                 }
             }
         }

         System.out.println("count " + count);
     }
 }
