import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfDigitsNumbers {
    public static void main(String[] args) {
        String s = "-13h-70j100";
        System.out.println("string -> " + s);

        char[] chArr = s.toCharArray();
        sumOfNumbersInString(chArr);
        sumOfDigitsInString(chArr);
        sumOfNumbersSignSensitive(s);
        sumOfDigitsSignSensitive(s);
    }

    private static void sumOfNumbersInString(char[] chArr) {
        int sum = 0;

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : chArr) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
            } else {
                if (!stringBuilder.toString().equals("")) {
                    sum += Integer.parseInt(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
            }
        }
        if (!stringBuilder.toString().equals("")) {
            sum += Integer.parseInt(stringBuilder.toString());
        }
        System.out.println("sum of numbers = " + sum);
    }

    private static void sumOfDigitsInString(char[] chArr) {
        int sum = 0;

        for (char c : chArr) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }

        System.out.println("sum of digits = " + sum);
    }

    private static void sumOfDigitsSignSensitive(String string) {
        int sum = 0;

        Pattern pattern = Pattern.compile("[-]*[0-9]", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group(0));
        }
        System.out.println("sum of digits (sign sensitive) = " + sum);
    }

    private static void sumOfNumbersSignSensitive(String string) {
        int sum = 0;

        Pattern pattern = Pattern.compile("[-]*[0-9]+", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group(0));
        }
        System.out.println("sum of numbers (sing sensitive) = " + sum);
    }
}
