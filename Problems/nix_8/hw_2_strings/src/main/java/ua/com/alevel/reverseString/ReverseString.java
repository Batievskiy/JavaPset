package ua.com.alevel.reverseString;

/*
 * Bunch of overloaded reverse methods to play with
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ReverseString {

    // default constructor
    private ReverseString() {

    }

    // TEST CODE STAGE...
    public static void main(String[] args) {

        String sourceString = "0123456789";
        String textString = "hello java world java";
        System.out.println();

        System.out.println("sourceString -> " + sourceString);
        System.out.println("textString -> " + textString + "\n");

        System.out.println("forLoopSimpleReverse -> " + reverse(sourceString));
        System.out.println("reverseStringPreserveWordPosition -> " + reverse(textString, true) + "\n");
        System.out.println("recursiveSimpleReverse -> " + reverseRecursive(sourceString));

        System.out.println("reverseStringStartIndex(sourceString, 6) -> " + reverse(sourceString, 6));
        System.out.println("reverseStringStartIndexEndIndex(sourceString, 1, 7) -> " + reverse(sourceString, 1, 7));
        System.out.println("reverseStringStartIndexEndIndexIsInclusive(sourceString, 1, 7, false), -> " + reverse(sourceString, 1, 7, false) + "\n");

        System.out.println("reverseStringBySubstring(sourceString, \"java\") -> " + reverse(textString, "java"));
        System.out.println("reverseStringStartSubstringEndSubstring(sourceString, \"23\", \"78\") -> " + reverse(sourceString, "23", "78"));
        System.out.println("reverseStringStartSubstringEndSubstringIsInclusive(sourceString, \"23\", \"78\", false) -> " + reverse(sourceString, "23", "78", false) + "\n");

        System.out.println("reverseStringStartChar(sourceString, '3') -> " + reverse(sourceString, '3'));
        System.out.println("reverseStringStartCharEndChar(sourceString, '1', '7') -> " + reverse(sourceString, '1', '7'));
        System.out.println("reverseStringStartCharEndCharIsInclusive(sourceString, '2', '7', false) -> " + reverse(sourceString, '2', '7', false) + "\n");
    }

    // old good for loop - reverse whole string
    public static String reverse(String sourceString) {
        StringBuilder reversedString = new StringBuilder();
        int sourceStringLength = sourceString.length();
        for (int i = sourceStringLength - 1; i >= 0; i--) {
            reversedString.append(sourceString.charAt(i));
        }
        return reversedString.toString();
    }

    // reverse string preserving words position (and proper amount of whitespaces)
    public static String reverse(String sourceString, boolean isWordsPositionPreserve) {
        if (isWordsPositionPreserve) {
            StringBuilder stringBuilder = new StringBuilder();
            String[] wordsArray = sourceString.split("\\s+");
            Matcher matcher = Pattern.compile("\\s+").matcher(sourceString);

            for (String currentWord : wordsArray) {
                stringBuilder.append(reverse(currentWord));
                if (matcher.find()) {
                    stringBuilder.append(matcher.group());
                }
            }
            return stringBuilder.toString();
        }
        return reverse(sourceString);
    }

    // recursive - reverse whole string
    public static String reverseRecursive(String sourceString) {
        if (sourceString.length() <= 1) return sourceString;

        return reverseRecursive(sourceString.substring(1)) + sourceString.charAt(0);
    }

    // reverse string by substring using replaceAll() can reverse all repeated substrings
    public static String reverse(String sourceString, String substring) {
        // check startSubstring and endChar in endSubstring ?
        if (!sourceString.contains(substring)) {
            System.err.println("\nsubstring isn't found in sourceString");
            throw new IllegalArgumentException();
        }
        return sourceString.replaceAll(substring, reverse(substring));
    }

    // reverse string from startIndex
    public static String reverse(String sourceString, int startIndex) {

        isStartIndexValid(sourceString, startIndex);

        // check if startIndex is zero then simply return sourceString
        if (startIndex == 0) return reverse(sourceString);

        String leftSubstring = sourceString.substring(0, startIndex);
        String rightSubstring = sourceString.substring(startIndex, (sourceString.length()));
        return leftSubstring + reverse(rightSubstring);
    }

    // reverse string from startIndex - (inclusive or exclusive)
    public static String reverse(String sourceString, int startIndex, boolean isInclusive) {

        // if NOT include startIndex - shift startIndex by +1
        if (!isInclusive) {
            // else
            startIndex += 1;
        }

        isStartIndexValid(sourceString, startIndex);

        if (startIndex == 0) return reverse(sourceString);

        String leftSubstring = sourceString.substring(0, startIndex);
        String rightSubstring = sourceString.substring(startIndex, (sourceString.length()));
        return leftSubstring + reverse(rightSubstring);
    }

    // reverse string from startIndex(inclusive) to endIndex(inclusive)
    public static String reverse(String sourceString, int startIndex, int endIndex) {

        isStartAndEndIndexValid(sourceString, startIndex, endIndex);

        // check if indexes are wrap whole sourceString
        if (startIndex == 0 && endIndex == sourceString.length() - 1) return reverse(sourceString);

        String leftSubstring = sourceString.substring(0, startIndex);
        String centerSubstring = sourceString.substring(startIndex, endIndex + 1);
        String rightSubstring = sourceString.substring(endIndex + 1, (sourceString.length()));
        return leftSubstring + reverse(centerSubstring) + rightSubstring;
    }

    // reverse string from startIndex to endIndex - (inclusive or exclusively)
    public static String reverse(String sourceString, int startIndex, int endIndex, boolean isInclusive) {

        // if NOT include indexes - narrowing indexes range by 1
        if (!isInclusive) {
            // else
            startIndex += 1;
            endIndex -= 1;
        }

        isStartAndEndIndexValid(sourceString, startIndex, endIndex);

        return reverse(sourceString, startIndex, endIndex);
    }

    // reverse string from start char(inclusive)
    public static String reverse(String sourceString, char startChar) {

        // check startChar in sourceString ?
        if (!sourceString.contains(Character.toString(startChar))) {
            System.err.println("\nstartChar isn't found in sourceString");
            throw new IllegalArgumentException();
        }

        int indexOfStartChar = sourceString.indexOf(startChar);
        return reverse(sourceString, indexOfStartChar);
    }

    // reverse string from start char(inclusive) to end char(inclusive)
    public static String reverse(String sourceString, char startChar, char endChar) {

        // check startChar and endChar in sourceString ?
        if (!sourceString.contains(Character.toString(startChar))) {
            System.err.println("\nstartChar isn't found in sourceString");
            throw new IllegalArgumentException();
        }
        if (!sourceString.contains(Character.toString(endChar))) {
            System.err.println("\nendChar isn't found in sourceString");
            throw new IllegalArgumentException();
        }

        int indexOfStartChar = sourceString.indexOf(startChar);
        int indexOfEndChar = sourceString.lastIndexOf(endChar);
        return reverse(sourceString, indexOfStartChar, indexOfEndChar);
    }

    // reverse string from startChar to endChar - (inclusive or exclusively)
    public static String reverse(String sourceString, char startChar, char endChar, boolean isInclusive) {
        int indexOfStartChar = sourceString.indexOf(startChar);
        int indexOfEndChar = sourceString.lastIndexOf(endChar);

        // if NOT include indexes - narrowing indexes range by 1
        if (!isInclusive) {
            // else
            indexOfStartChar += 1;
            indexOfEndChar -= 1;
        }

        return reverse(sourceString, indexOfStartChar, indexOfEndChar);
    }

    // reverse string from start substring to end string
    public static String reverse(String sourceString, String startSubstring, String endSubstring) {
        // check startSubstring and endChar in endSubstring ?
        if (!sourceString.contains(startSubstring)) {
            System.err.println("\nstartSubstring isn't found in sourceString");
            throw new IllegalArgumentException();
        }
        if (!sourceString.contains(endSubstring)) {
            System.err.println("\nendSubstring isn't found in sourceString");
            throw new IllegalArgumentException();
        }

        int indexOfStartSubstring = sourceString.indexOf(startSubstring);
        int indexOfEndSubstring = sourceString.lastIndexOf(endSubstring);

        return reverse(sourceString, indexOfStartSubstring, indexOfEndSubstring);
    }

    // reverse string from start substring to end string - (inclusive or exclusively)
    public static String reverse(String sourceString, String startSubstring, String endSubstring, boolean isInclusive) {
        int indexOfStartSubstring = sourceString.indexOf(startSubstring);
        int indexOfEndSubstring = sourceString.lastIndexOf(endSubstring);

        if (!isInclusive) {
            // else
            indexOfStartSubstring += 1;
            indexOfEndSubstring -= 1;
        }

        return reverse(sourceString, indexOfStartSubstring, indexOfEndSubstring);
    }

    // start index validation
    private static void isStartIndexValid(String sourceString, int startIndex) {
        if (startIndex < 0 || startIndex > sourceString.length()) {
            System.err.println("\nstartIndex out of bounds");
            throw new IndexOutOfBoundsException();
        }
    }

    // startIndex and endIndex validation
    private static void isStartAndEndIndexValid(String sourceString, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            System.err.println("\nstartIndex cannot be greater than endIndex!");
            throw new IllegalArgumentException();
        }
        if (startIndex < 0) {
            System.err.println("\nstartIndex out of bounds");
            throw new IndexOutOfBoundsException();
        }
        if (endIndex > sourceString.length() - 1) {
            System.err.println("\nendIndex out of bounds");
            throw new IndexOutOfBoundsException();
        }
    }
}
