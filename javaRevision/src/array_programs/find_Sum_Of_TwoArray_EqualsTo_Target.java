package array_programs;

/**
 * find_Sum_Of_TwoArray_EqualsTo_Target
 */
public class find_Sum_Of_TwoArray_EqualsTo_Target {

    public static void main(String[] args) {
        int x = 20;
        // int sum = 0;
        // int f = 0, s = 0;
        int []  arr = { 1,2,3,4,5,6,6,12,77,7,8,9,10,11};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[i] + arr[j]==x) {
                    System.out.println("sum of " + arr[i] + " & " + arr[j] + " is equals x " + x);
                }
            }
        }
    }
}