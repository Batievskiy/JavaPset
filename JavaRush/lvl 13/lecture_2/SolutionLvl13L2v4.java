// JavaRush lvl 13 lecture 2 problem
// create method divide(double a double b) - to print out result of a / b
public class SolutionLvl13L2v4 {
    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);

    }

    public static void divide(double a, double b) {
        System.out.println(a / b);
    }
}
