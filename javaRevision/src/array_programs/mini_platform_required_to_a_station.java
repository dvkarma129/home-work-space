package array_programs;

import java.util.Arrays;

public class mini_platform_required_to_a_station {
    public static void main(String[] args) {

        int arrival[] = { 100, 140, 150, 155, 200, 215, 400, };
        int dep[] = { 110, 300, 210, 210, 230, 315, 600 };

        int l = dep.length;
        int miniReq = 0, count = 0;
        int i = 0, j = 0;
        Arrays.sort(arrival);
        Arrays.sort(dep);

        while (i < l && j < l) {
            if (arrival[i] < dep[j]) {
                count++;
                i++;
                if (miniReq < count) {
                    miniReq = count;
                }
            } else {
                count--;
                j++;
            }
        }
        System.out.println("minimum platform required for the station is " + miniReq);
    }
}
