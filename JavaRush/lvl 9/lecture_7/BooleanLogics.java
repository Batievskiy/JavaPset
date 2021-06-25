// strange problem from JavaRush
// change taskForCondition() for printing 30
// you can only change logical operators: && to &, || to |
public class BooleanLogics {


    public static void main(String[] args) {
        taskForCondition();
    }

    /* Source code to change:

    public static void taskForCondition() {
        int number = 15;
        boolean conditionFirst = number < 15 && number > 25 && (number += 15) < 25;
        boolean conditionSecond = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
    
     */

    public static void taskForCondition() {
        int number = 15;
        boolean conditionFirst = number < 15 & number > 25 & (number += 15) < 25;
        boolean conditionSecond = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
