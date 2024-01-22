package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDupElmnt {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 6, 7));
        List<Integer> list2 = new ArrayList<>();

        int j = 0;

        for (int i = 1; i < list.size(); i++) {
            if (!list.get(j).equals(list.get(i))) {
                list2.add(list.get(j));
                j = i;            }
        }

        list2.add(list.get(j));
        System.out.println(list2);
    }
}
