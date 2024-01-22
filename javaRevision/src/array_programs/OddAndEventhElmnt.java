package array_programs;

public class OddAndEventhElmnt {
    public static void main(String[] args) {
        
        int [] arr = {1,2,4,5,6,7,7,66,67,667,7,6575,5,5,44,4556,99};

        System.out.println("Even elements: ");
        for (int i = 1; i < arr.length; i=i+2) {//loop starts from 1 becuse at i=0 index is 1 i.e even
            System.out.println(arr[i]);
        }

        System.out.println("elemnts at odd index ");
        for (int i = 0; i < arr.length; i=i+2) {
            System.out.println(arr[i]);
        }
    }
}
