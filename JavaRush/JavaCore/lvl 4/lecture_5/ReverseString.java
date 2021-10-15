import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    private static final String PROMPT_STRING = "Input string -> ";
    private static final BufferedReader B_READER = new BufferedReader(
            new InputStreamReader(System.in)
    );

    public static void main(String[] args) {

        String string = getString();
        System.out.println(string);

//        String sourceString = "0123456789";
//
//        String stringArgs1 = "910404044, 3, 8";
//
//        System.out.println("forLoopReverse - > " + forLoopReverse(sourceString) + "\n");
//
//        System.out.println("recursiveSimpleReverse -> " +
//                recursiveSimpleReverse(sourceString) + "\n");
//
//        System.out.println("reverseFromStartToEnd -> " +
//                reverseFromStartToEnd(stringArgs1.split(", ")) + "\n");
//
//        reverseSubstringOfString("0123456789", "012");
    }

    // reverse using good old for loop
    private static String forLoopReverse(String sourceString) {
        StringBuilder resultString = new StringBuilder();

        char currentChar;

        int stringLength = sourceString.length();

        for (int i = stringLength - 1; i >= 0; i--) {
            currentChar = sourceString.charAt(i);
            resultString.append(currentChar);
        }
        return resultString.toString();
    }

    // reverse using recursion
    private static String recursiveSimpleReverse(String sourceString) {

        if (sourceString.length() <= 1) {
            return sourceString;
        }
        return recursiveSimpleReverse(sourceString.substring(1)) + sourceString.charAt(0);
    }

    // reverse substring in string
    private static String reverseSubstringOfString(String sourceString, String subString) {

        StringBuilder resultString = new StringBuilder(sourceString);

        int subStringStartIndex = resultString.indexOf(subString);
        int subStringEndIndex = subStringStartIndex + subString.length();

        String leftString = resultString.substring(0, subStringStartIndex);
        System.out.println("leftString -> " + leftString);

        System.out.println("subString -> " + subString);

        String rightString = resultString.substring(subStringEndIndex, sourceString.length());
        System.out.println("rightString -> " + rightString);

        System.out.println("reunion -> " + leftString + recursiveSimpleReverse(subString) + rightString);


        return resultString.toString();
    }


    // reverse string from index start to index end
    private static String reverseFromStartToEnd(String[] args) {
        String sourceString = args[0];
        int startIndex = Integer.parseInt(args[1]);
        int endIndex = Integer.parseInt(args[2]);

        StringBuilder resultString = new StringBuilder();

        if (startIndex < 0 || endIndex >= sourceString.length() || startIndex > endIndex) {
            return "Invalid indexes!";
        }

        char[] chArr = sourceString.toCharArray();

        while (startIndex < endIndex) {

            char c = chArr[startIndex];
            chArr[startIndex] = chArr[endIndex];
            chArr[endIndex] = c;

            startIndex++;
            endIndex--;
        }
        return resultString.append(chArr).toString();
    }

    // prompt string
    private static String getString() {
        String resultString = "";
        try (B_READER) {
            while (true) {
                System.out.println(PROMPT_STRING);
                resultString = B_READER.readLine();
                if (resultString.isEmpty()) {
                    return "Your string was empty ;)";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultString;
    }
}
