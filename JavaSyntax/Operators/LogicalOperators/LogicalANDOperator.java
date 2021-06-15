// what is Logical AND && operator in Java?
// let's find out
public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println("---< Logical AND && operator >---");

        // Returns True when both the conditions
        // are satisfied or are True
        // If even one of the two is False
        // - > the operator result is False
        int a = 10;
        int b = 20;
        int c = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        System.out.println("(a > b) && (b == c) ?");
        if ((a > b) && (b == c)) {
            System.out.println("True");
        } else {
            System.out.println("False!");
            System.out.println("because (a > b) is False -> (b == c) is not considered");
        }

        System.out.println();

        System.out.println("(a < b) && (b == c) ?");
        if ((a < b) && (b == c)) {
            System.out.println("True");
            System.out.println("because (a < b) is True -> (b == c) is not considered");
        } else {
            System.out.println("False!");
        }
    }
}
