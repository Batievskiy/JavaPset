// let's make simple calculator
// that takes numbers from arguments and operator from arguments
// `number number operator`
public class ArgumentCalculator {
    public static void main(String[] args) {

        if (args.length <= 2) {
            System.out.println("Provide two numbers and one operator:");
            System.out.println("ArgumentCalculator.java number number sum / subtract / multiply or divide");
            System.exit(1);
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        String operator = args[2];

        double result = calculate(a, b, operator);
        System.out.println(result);
    }

    static double calculate(double a, double b, String operator) {
        return switch (operator) {
            case "sum" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> a / b;
            default -> Double.MAX_VALUE;
        };
    }
}
