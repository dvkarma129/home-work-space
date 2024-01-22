package array_programs;

import java.util.Arrays;

public class longestPrefixInArray {
    public static void main(String[] args) {
        String[] arr = { "hell", "hell", "hello", "hellew" };
    
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);

        char []  f = arr[0].toCharArray();
        char []  l = arr[arr.length-1].toCharArray();

        for (int i = 0; i < f.length; i++) {
            
            if (f[i]==l[i]) {
                sb.append(f[i]);
            } else {
                break;
            }
        }

        System.out.println(sb);
     }

}
