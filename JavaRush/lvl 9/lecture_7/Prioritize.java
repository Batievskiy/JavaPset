// JavaRush problem
// change main() to output number 12
public class Prioritize {

    /* Source code to change:
        public static void main(String[] args) {
        int number = 2;
        System.out.println(number + number * number + ++number);
    }
     */

    public static void main(String[] args) {
        int number = 2;
        System.out.println(number + number * (number + ++number));
    }
}