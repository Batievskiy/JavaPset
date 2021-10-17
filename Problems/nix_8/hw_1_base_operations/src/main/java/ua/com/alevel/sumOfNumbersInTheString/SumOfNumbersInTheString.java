// 1. Get the string from user in console.
// 2. Parse all numbers from this string.
// 3. Find sum of all numbers in the string.

package ua.com.alevel.sumOfNumbersInTheString;

import ua.com.alevel.interfaces.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInTheString implements Game {

    public static final String TITLE = "\n---< Parse all numbers from String and Sum them all >---\n";

    @Override
    public void play(BufferedReader bufferedReader) throws IOException {
        title();

        String rawString = getString(bufferedReader);

        runSumAllMethods(rawString, isDigitsInString(rawString));
    }

    private static void title() {
        System.out.println(TITLE);
    }

    private static String getString(BufferedReader bufferedReader) throws IOException {
        System.out.print("Input a string -> ");
        return bufferedReader.readLine();
    }

    private static void sumOfDigitsInString(String s) {
        char[] chArr = s.toCharArray();

        int sum = 0;

        for (char c : chArr) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }

        System.out.println("sum of digits = " + sum);
    }

    private static void sumOfDigitsSignSensitive(String s) {
        int sum = 0;

        Pattern pattern = Pattern.compile("-?[0-9]", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group(0));
        }
        System.out.println("sum of digits (sign sensitive) = " + sum);
    }

    private static void sumOfNumbersInString(String s) {
        char[] chArr = s.toCharArray();

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

    private static void sumOfNumbersSignSensitive(String s) {
        int sum = 0;

        Pattern pattern = Pattern.compile("-?[0-9]+", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group(0));
        }
        System.out.println("sum of numbers (sing sensitive) = " + sum);
    }


    private static Boolean isDigitsInString(String rawString) {
        Pattern pattern = Pattern.compile("(.)*(\\d)(.)*");
        Matcher matcher = pattern.matcher(rawString);

        if (!matcher.find()) {
            System.out.println("\nNothing to sum ;)");
            return false;
        }
        return true;
    }

    private static void runSumAllMethods(String s, boolean isDigitsInString) {
        if (isDigitsInString) {
            sumOfDigitsInString(s);
            sumOfDigitsSignSensitive(s);
            sumOfNumbersInString(s);
            sumOfNumbersSignSensitive(s);
        }
    }
}
