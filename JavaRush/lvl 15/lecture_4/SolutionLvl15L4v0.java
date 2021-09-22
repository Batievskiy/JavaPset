// JavaRush lvl 15 lecture 4 problem
// catch an exception in main method -> print out errorMessage
public class SolutionLvl15L4v1 {
    public static String errorMessage = "Unlucky!";

    public static void main(String[] args) {
        try {
            generateLuckyNumber();
        } catch (Exception e) {
            System.out.println(errorMessage);
        }
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("your lucky Number is -> " + luckyNumber);
    }
}
