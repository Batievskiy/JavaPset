// rewrite code using Scanner;

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class SolutionLvl16L3v2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        try (InputStream inputStream = System.in;
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
//            String line = bufferedReader.readLine();
//            char[] chars = line.toCharArray();
//            Set<Character> characterSet = new HashSet<>();
//            for (char currentChar : chars) {
//                if (Character.isAlphabetic(currentChar)) {
//                    characterSet.add(Character.toLowerCase(currentChar));
//                }
//            }
//            System.out.println(characterSet);
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }

        // rewritten using Scanner
        String line = SCANNER.nextLine();

        char[] chars = line.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for (char currentChar : chars) {
            if (Character.isAlphabetic(currentChar)) {
                characterSet.add(Character.toLowerCase(currentChar));
            }
        }
        System.out.println(characterSet);
    }
}
