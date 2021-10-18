/*
 * 1. Write program:
 * - to read directory path from console;
 * - get list of files and directories;
 * - print out this info in console.
 * in such pattern:
 * - filePath - this is a file;
 * - dirPath - this is a directory;
 * 2. Use classes Files:
 * - newDirectoryStream(Path);
 * - isRegularFile(Path);
 * - isDirectory(Path);
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SolutionLvl16L6v2 {

    private static final String THIS_IS_FILE = " - this is a file.";
    private static final String THIS_IS_DIR = " - this is directory.";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Path.of(scanner.nextLine());

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
            for (Path currentPath : directoryStream) {
                if (Files.isRegularFile(currentPath)) {
                    System.out.println(currentPath + THIS_IS_FILE);
                } else if (Files.isDirectory(currentPath)) {
                    System.out.println(currentPath + THIS_IS_DIR);
                }
            }
        }
    }
}
