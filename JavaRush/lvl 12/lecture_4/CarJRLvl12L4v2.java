// JavaRush lvl 12 lecture 4 problem
// create inner static class Calculator and transfer al methods inside of it
public class CarJRLvl12L4v2 {
    public static final String EQUAL = " = ";

    /* correct code:
    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
    }

    public static void add(int a, int b) {
        System.out.println(a + " + " + b + EQUAL + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println(a + " - " + b + EQUAL + (a - b));
    }

    public static void multiply(int a, int b) {
        System.out.println(a + " * " + b + EQUAL + (a * b));
    }

    public static void divide(int a, int b) {
        System.out.println(a + " / " + b + EQUAL + (a / b));
    }
     */

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }

    public static class Calculator {
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}
