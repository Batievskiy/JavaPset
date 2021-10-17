public class StringReverse {

    public static void main(String[] args) {

        String sourceString = "0123456789";
//        String textString = "hello java world";
        System.out.println();
        System.out.println("sourceString -> " + sourceString);

//        System.out.println("forLoopSimpleReverse -> " + reverse(sourceString));

//        System.out.println("recursiveSimpleReverse -> " + reverseRecursive(sourceString));

//        System.out.println("reverseStringBySubstring -> " + reverse(sourceString, "3456"));

//        System.out.println("reverseStringStartIndexEndIndex -> " + reverse(sourceString, 1, 7));

//        System.out.println("reverseStringStartIndexEndIndexIsInclusive -> " + reverse(sourceString, 1, 7, false));

//        System.out.println("reverseStringStartCharEndChar -> " + reverse(sourceString, '1', '7'));

//        System.out.println("reverseStringStartCharEndCharIsInclusive -> " + reverse(sourceString, '2', '7', false));

//        System.out.println("reverseStringStartSubstringEndSubstring -> " + reverse(sourceString, "23", "78"));

//        System.out.println("reverseStringStartSubstringEndSubstringIsInclusive -> " + reverse(sourceString, "23", "78", false));

    }

    // old good for loop reverse
    public static String reverse(String sourceString) {
        StringBuilder reversedString = new StringBuilder();
        int sourceStringLength = sourceString.length();
        for (int i = sourceStringLength - 1; i >= 0; i--) {
            reversedString.append(sourceString.charAt(i));
        }
        return reversedString.toString();
    }

    // recursive reverse
    public static String reverseRecursive(String sourceString) {
        if (sourceString.length() <= 1) return sourceString;

        return reverseRecursive(sourceString.substring(1)) + sourceString.charAt(0);
    }

    // reverse string from start index(inclusive) to end index(inclusive)
    public static String reverse(String sourceString, int startIndex, int endIndex) {

        if (startIndex > endIndex) {
            System.err.println("startIndex cannot be greater than endIndex!");
            throw new IllegalArgumentException();
        }
        if (startIndex < 0) {
            System.err.println("startIndex out of bounds");
            throw new IndexOutOfBoundsException();
        }
        if (endIndex > sourceString.length() - 1) {
            System.err.println("endIndex out of bounds");
            throw new IndexOutOfBoundsException();
        }

        // check if indexes are wrap whole sourceString
        if (startIndex == 0 && endIndex == sourceString.length() - 1) return reverse(sourceString);

        String leftSubstring = sourceString.substring(0, startIndex);
        String centerSubstring = sourceString.substring(startIndex, endIndex + 1);
        String rightSubstring = sourceString.substring(endIndex + 1, (sourceString.length()));
        return leftSubstring + reverse(centerSubstring) + rightSubstring;
    }

    // reverse string from start index to end index - (inclusive or exclusively)
    public static String reverse(String sourceString, int startIndex, int endIndex, boolean isInclusive) {
        if (startIndex > endIndex) {
            System.err.println("startIndex cannot be greater than endIndex!");
            throw new IllegalArgumentException();
        }
        if (startIndex < 0) {
            System.err.println("startIndex out of bounds");
            throw new IndexOutOfBoundsException();
        }
        if (endIndex > sourceString.length() - 1) {
            System.err.println("endIndex out of bounds");
            throw new IndexOutOfBoundsException();
        }

        // if NOT include indexes - narrowing indexes range by 1
        if (!isInclusive) {
            // else
            startIndex += 1;
            endIndex -= 1;
        }
        return reverse(sourceString, startIndex, endIndex);
    }

    // reverse string from start char(inclusive) to end char(inclusive)
    public static String reverse(String sourceString, char startChar, char endChar) {

        // check startChar and endChar in sourceString ?
        if (!sourceString.contains(Character.toString(startChar))) {
            System.err.println("startChar isn't found in sourceString");
            throw new IllegalArgumentException();
        }
        if (!sourceString.contains(Character.toString(endChar))) {
            System.err.println("endChar isn't found in sourceString");
            throw new IllegalArgumentException();
        }

        int indexOfStartChar = sourceString.indexOf(startChar);
        int indexOfEndChar = sourceString.lastIndexOf(endChar);
        return reverse(sourceString, indexOfStartChar, indexOfEndChar);
    }

    // reverse string from start char to end char - (inclusive or exclusively)
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
            System.err.println("startSubstring isn't found in sourceString");
            throw new IllegalArgumentException();
        }
        if (!sourceString.contains(endSubstring)) {
            System.err.println("endSubstring isn't found in sourceString");
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

    // reverse string by substring splitting to right and left parts around substring
    public static String reverse(String sourceString, String substring) {

        int firstIndexOfSubstring = sourceString.indexOf(substring);
        int lastIndexOfSubstring = firstIndexOfSubstring + substring.length();

        String leftSubstring = sourceString.substring(0, firstIndexOfSubstring);
        String rightSubstring = sourceString.substring(lastIndexOfSubstring);

        return leftSubstring + reverseRecursive(substring) + rightSubstring;
    }

    // reverse string by substring using replaceAll()
    public static String reverseStringBySubstring2(String sourceString, String substring) {
        return sourceString.replaceAll(substring, reverse(substring));
    }

    // reverse string preserving words position
    public static String reverseStringPreserveWordPosition(String sourceString) {
        StringBuilder stringBuilder = new StringBuilder();
        return sourceString;
    }
}
