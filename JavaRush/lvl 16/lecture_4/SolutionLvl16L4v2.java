/*
 * 1. reverse output using PrintStream
 * -
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SolutionLvl16L4v2 {
    public static ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    public static PrintStream printStream = new PrintStream(byteArrayOutputStream);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());

        String resultString = byteArrayOutputStream.toString();

        byteArrayOutputStream.reset();
        StringBuilder stringBuilder = new StringBuilder(resultString);
        String reverseString = stringBuilder.reverse().toString();

        printSomething(reverseString);
        System.out.println(byteArrayOutputStream);
    }

    public static void printSomething(String str) {
        printStream.print(str);
    }
}
