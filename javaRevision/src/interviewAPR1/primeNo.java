package interviewAPR1;

public class primeNo {
    public static void main(String[] args) {

        for (int i = 2; i <= 110; i++) {
            int prime = 0;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    prime ++;
                    break;
                }
            }

            if (prime==0) {
                System.out.println(i);
            }
        }
    }
}
