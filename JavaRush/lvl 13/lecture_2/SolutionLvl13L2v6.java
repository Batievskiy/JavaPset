// JavaRush lvl 13 lecture 2 problem
// correct program
public class SolutionLvl13L2v6 {
    public static void main(String[] args) {
        int first = 2;
        int second = 3;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("first is less than second");
        } else {
            System.out.println("first is greater than second");
        }

    }

    public static Boolean isLess(int first, int second) {

        // return first < second ? true : null;
        return first < second ? true : false; // <--- have to be true or false
    }
}
