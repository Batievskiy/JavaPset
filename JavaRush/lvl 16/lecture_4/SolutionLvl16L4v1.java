/* correct the program:
 * 1. to write array of characters into a file;
 * - use BufferedWriter and Path.
 * - close all resources.
 * DON'T use File, FileInputStream, FileOutputStream, FileReader, FileWriter.
 */

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.IOException;

public class SolutionLvl16L4v1 {
    public static void main(String[] args) {
        char[] chArr = args[0].toCharArray();

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()));
        ) {
            bufferedWriter.write(chArr);
        } catch (IOException e) {
            System.out.println("error -> " + e);
        }
    }
}
