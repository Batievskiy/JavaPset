/*
 * 1. Read the fileName from console;
 * 2. Read numbers from the file;
 * 3. Print out EVEN numbers in ascending order
 * 4. Use FileInputStream.
 */

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SolutionLvl3L11v10 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PROMPT = "Enter a fileName -> ";

    public static void main(String[] args) {
        printEvenNumbers(
                getEvenNumbers(
                        getLine(PROMPT)));
    }

    private static void printEvenNumbers(List<Integer> evenNumbers) {
        for (Integer value : evenNumbers) {
            System.out.println(value);
        }
    }

    private static String getLine(String prompt) {
        String s = "";
        try {
            while (s.isEmpty()) {
                System.out.print(prompt);
                s = SCANNER.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    private static List<Integer> getEvenNumbers(String fileName) {
        List<Integer> arrayListNumbers = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName), StandardCharsets.UTF_8));
        ) {
            int value;
            while (bufferedReader.ready()) {
                value = Integer.parseInt(bufferedReader.readLine());
                if (value % 2 == 0)
                    arrayListNumbers.add(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(arrayListNumbers);
        return arrayListNumbers;
    }
}
