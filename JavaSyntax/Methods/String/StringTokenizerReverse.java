// reverse words in String

import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class StringTokenizerReverse {
    public static void main(String[] args) {
        String s1 = "token1, token2, token3, token4,";
        System.out.println("s1 -> " + s1);

        String s2 = reverseWords(s1);
        System.out.println("s2 -> " + s2);

        String s3 = revWds(s2);
        System.out.println("s3 -> " + s3);
    }

    public static String reverseWords(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, " ");
        List<String> words = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            words.add(tokenizer.nextToken());
        }

        Collections.reverse(words);
        return String.join(" ", words);
    }

    public static String revWds(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
        String[] words = new String[stringTokenizer.countTokens()];
        int count = 0;
        while (stringTokenizer.hasMoreTokens()) {
            words[count++] = stringTokenizer.nextToken();
        }

        StringBuilder sb1 = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb1.append(words[i]);
            if (i > 0) {
                sb1.append(" ");
            }
        }
        return sb1.toString();
    }
}