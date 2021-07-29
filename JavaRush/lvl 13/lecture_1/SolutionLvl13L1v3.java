// JavaRush lvl 13 lecture 1 problem
// add method equals() in main - minimum times
//- for output: true, true, true
public class SolutionLvl13L1v3 {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second)); // <--- here
        System.out.println(third == second);
        System.out.println(third == third);
    }
}
