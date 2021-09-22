// JavaRush lvl 15 lecture 4 problem
// don't use try catch and correct program
public class SolutionLvl15L4v2 {
    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("Unlucky");
        }
        System.out.println("your lucky Number is -> " + luckyNumber);
    }
}
