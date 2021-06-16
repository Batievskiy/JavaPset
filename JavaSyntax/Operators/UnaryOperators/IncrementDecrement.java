public class IncrementDecrement {
    public static void main(String[] args) {

        // The Increment unary operator:
        // - increases the value of the variable by one
        // The Decrement unary operator:
        // - decrease the value of the variable by one

        System.out.println("---< Pre-Increment >---");
        // Pre-Increment
        // while using prefix form, we first increment the value of the operand
        // and then we use the new value in the expression
        int operand = 1;
        System.out.println("operand = " + operand);
        ++operand; // operand = operand + 1 // operand = 2
        System.out.println("++operand;");
        System.out.println("operand = " + operand);
        int number = ++operand; // number = operand + 1 // number = 3
        System.out.println("number = ++operand;");
        System.out.println("number = " + number);

        System.out.println("---< Pre-Decrement >---");
        // Pre-Decrement
        // while using prefix form, we first decrement the value of the operand
        // and then we use the new value in the expression
        System.out.println("operand = " + operand);
        System.out.println("--operand;");
        --operand;
        System.out.println("operand = " + operand);
        System.out.println("number = --operand;");
        number = --operand;
        System.out.println("number = " + number);

        System.out.println("---< Post-Increment >---");
        // Post-Increment
        // While using the postfix form,
        // we first use the value of the operand in the expression
        // and then increment operand
        System.out.println("operand = " + operand);
        System.out.println("operand++;");
        operand++;
        System.out.println("operand++ = " + operand);
        System.out.println("number = operand++;");
        number = operand++;
        System.out.println("number = " + number);

        System.out.println("---< Post-Decrement >---");
        // Post-Decrement
        // While using the postfix form,
        // we first use the value of the operand in the expression
        // and then decrement operand
        System.out.println("operand = " + operand);
        operand--;
        System.out.println("operand--;");
        System.out.println("operand = " + operand);
        System.out.println("number = operand--;");
        number = operand--;
        System.out.println("number = " + number);
        System.out.println("operand = " + operand);


        System.out.println("---< fancy ++a + ++a example :) >---");
        // last example
        int a = 5;
        System.out.println("a = " + a);
        System.out.println("b = ++a + ++a");
        int b = ++a + ++a; // yes, we can do that :)
        System.out.println("b = " + b);
    }
}
