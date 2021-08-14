// create program that reads two paths from console
// if file at first path does not exist -> create file
// if file at first path exist -> move to path two
// if file exist at first and second path -> delete file at first path

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SolutionLvl16L6v1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        } else if (Files.notExists(fileNewPath)) {
            Files.move(filePath, fileNewPath);
        } else {
            Files.delete(filePath);
        }
    }
}
