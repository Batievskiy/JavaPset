import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;

public class SolutionLvl16L6v4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path sourceDir = Paths.get(scanner.nextLine());
        Path destDir = Paths.get(scanner.nextLine());

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDir)) {
            for (Path currentPath : directoryStream) {
                if (Files.isRegularFile(currentPath)) {
                    Path resolve = destDir.resolve(currentPath.getFileName());
                    Files.move(currentPath, resolve);
                }
            }
        }
    }
}
