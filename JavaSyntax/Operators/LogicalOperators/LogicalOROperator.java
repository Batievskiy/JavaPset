// what is Logical OR || operator in Java?
// let's find out
public class LogicalOROperator {
    public static void main(String[] args) {
        System.out.println("---< Logical OR || operator >---");

        // Returns True when one of the conditions
        // are satisfied or are True
        // If even one of the two is True
        // - > the operator result is True
        int a = 10;
        int b = 20;
        int c = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        System.out.println("(a > b) || (b == c) ?");
        if ((a > b) || (b == c)) {
            System.out.println("True");
            System.out.println("even if (a > b) is False -> (b == c) is considered and its True");
        } else {
            System.out.println("False!");
        }
        System.out.println();

        System.out.println("(a < b) || (b == c) ?");
        if ((a < b) || (b == c)) {
            System.out.println("True");
            System.out.println("because (a < b) is True -> (b == c) doesn't need to be considered");
        } else {
            System.out.println("False!");
        }
    }
}
