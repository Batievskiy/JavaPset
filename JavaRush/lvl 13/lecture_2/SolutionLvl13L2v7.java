// JavaRush lvl 13 lecture 2 problem
// create method compare(Character, Character)
public class SolutionLvl13L2v7 {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'b');
        compare('r', 's');
        compare('z', 'z');
    }

    public static void compare(Character first, Character second) {
        if (first.equals(second)) { // <--- corrected (incorrect ---> first == second)
            System.out.println("equals");
        } else if (first > second) {
            System.out.println("greater");
        } else if (first < second) {
            System.out.println("less");
        } else {
            System.out.println("can't be possible!");
        }
    }
}
