package array_programs;
public class totalDistanceTraveled {
    public static void main(String[] args) {
        int mainTank = 5;
        int additionalTank = 10;

        int result = 0;
        for (int i = 1; i <= mainTank; i++) {
            if (additionalTank != 0 && i % 5 == 0) {
                additionalTank = additionalTank - 1;
                result = result + 10;
                mainTank = mainTank + 1;
            } else {
                result = result + 10;
            }
        }
        System.out.println(result);
    }
}
