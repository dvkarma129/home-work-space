package array_programs;

public class rotateArray {
    public static void main(String[] args) {
        
        int []arr = {1,2,3,4,5}; //{4,5,1,2,3}
       int k = 4;
        for (int i = 0; i < k; i++) {//0,1,2
            int first;
            int j;//4

           //{2,3,4,5,1}0,1,2,3,4
            first = arr[0];//1,
            for (j = 0; j < arr.length-1; j++) {//0,1,2 
                arr[j] = arr[j+1];//2,3,
            }

            arr[j] = first; 
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
