// JavaRush lvl 12 lecture 6 problem
// create digit to text representation
public class DigitToText {
    public static void main(String[] args) {
        String numberStr = "14789504";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }
    public static String digitToText(char digit) {
        return switch (digit) {
            case '0' -> "zero";
            case '1' -> "one";
            case '2' -> "two";
            case '3' -> "three";
            case '4' -> "four";
            case '5' -> "five";
            case '6' -> "six";
            case '7' -> "seven";
            case '8' -> "eight";
            case '9' -> "nine";
            default -> "";
        };
    }
}
