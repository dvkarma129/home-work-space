package interviewAPR1;

public class reverseStringWithoutChangingWordPosition {
    public static void main(String[] args) {

        String s = "hello world";
        String result = "";

        String s2 [] = s.split(" ");
        
        for (int i = 0; i < s2.length; i++) {
			String temp = s2[i];
			
			for (int j = temp.length()-1; j >=0 ; j--) {
				result = result + temp.charAt(j);
			}
			result = result + " ";
		}
       
        
        System.out.println(result);
    }
}
