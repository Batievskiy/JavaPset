// what is a Methods in Java?
// let's find out
public class MethodsBasics {

    // a Method is a block of code that performs a specific task
    // dividing a complex problem into smaller chunks
    // makes our program easy to understand and reusable

    // In Java there are two types of methods:
    // User-defined Methods - we can create our own
    // Standard Library Methods - built-in in Java
    // The main advantage is code reusability

    /* how to declare a method?
    modifier static returnType nameOfMethod (parameter1, parameter 2, ...) {
        // method body
    */// let's try it out!

    // let's create method to SUM integers
    public int sumNumbers(int a, int b) {
        // return value
        return a + b;
    }

    // let's make a method to count Square
    public static int squareNumber(int num) {
        return num * num;
    }

    // let's make a method without parameters
    public static void noParametersMethod() {
        System.out.println("I am the Method without parameters :)");
    }

    public static void main(String[] args) {
        int number1 = 33;
        int number2 = 77;

        // create an Object of MethodsBasics
        MethodsBasics object = new MethodsBasics();

        // calling SUM method
        int result = object.sumNumbers(number1, number2);
        System.out.println("sum is: " + result);

        // calling Square method pass there previous result
        result = squareNumber(result);
        System.out.println("square of previous result is: " + result);

        // calling a method without a parameters
        noParametersMethod();

        // and now let's use some Standard Library Methods
        int number = 81;
        System.out.println("square root of " + number + " is: " + Math.sqrt(number));
    }
}
