/*
 * 1. Write a program:
 * - to read two paths to directories
 * - and copy files from one directory to another.
 * 2. Use class Files:
 * - newDirectoryStream();
 * - isRegularFile();
 * - isDirectory();
 * - copy();
 * DON'T use File, FileInputStream, FileOutputStream, FileReader, FileWriter.
 */

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class SolutionLvl16L6v3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path sourceDir = Path.of(scanner.nextLine());
        Path destDir = Path.of(scanner.nextLine());

        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDir)) {
            for (Path path : files) {
                if (Files.isRegularFile(path)) {
                    Path resolve = destDir.resolve(path.getFileName());
                    Files.copy(path, resolve);
                }
            }
        }
    }
}
