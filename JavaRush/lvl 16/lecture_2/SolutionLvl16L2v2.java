// create a program that reads file name from the console
// reads all lines in this file - readAllLines(Path)
// and print out them without ' . , and space '

// DON'T use File, FileInputStream, FileOutputStream, FileReader, FileWriter
// of the packet java.io.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class SolutionLvl16L2v2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String file = sc.nextLine().trim();
            List<String> filesList = Files.readAllLines(Paths.get(file));
            for (String line : filesList) {
                System.out.print(line
                        .replaceAll("[.]", "")
                        .replaceAll("[,]", "")
                        .replaceAll("[ ]", ""));
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }

//    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(System.in)) {
//            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
//            lines.forEach(str -> {
//                char[] chars = str.toCharArray();
//                for (char character : chars) {
//                    if (character != ' ' && character != '.' && character != ',') {
//                        System.out.print(character);
//                    }
//                }
//            });
//        } catch (Exception e) {
//            System.out.println("Something went wrong : " + e);
//        }
//    }
}
