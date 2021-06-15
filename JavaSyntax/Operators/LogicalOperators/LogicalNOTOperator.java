// what is Logical NOT ! operator in Java?
// let's find out
public class LogicalNOTOperator {
    public static void main(String[] args) {
        System.out.println("---< Logical NOT ! operator >---");

        // This is unary operator
        // Returns True when the condition us not satisfied
        // of is a False condition
        // Basically, if the condition is False -> the operator return True
        // anf if the condition is True -> the operator return False
        int a = 10;
        int b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        System.out.println("!(a > b) ? <- a not greater the b ?");
        if (!(a > b)) {
            System.out.println("True");
            System.out.println("because (a > b) is False -> the operator returns True");
        } else {
            System.out.println("False!");
        }
        System.out.println();

        System.out.println("!(a < b) <- a not less the b ?");
        if (!(a < b)) {
            System.out.println("True");
        } else {
            System.out.println("False!");
            System.out.println("because (a < b) is True -> the operator returns False");
        }
    }
}