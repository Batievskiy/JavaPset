import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDirectoryStreamLvl16L6 {
    public static void main(String[] args) {
        Path directory = Path.of("test");
        try {
            Files.createDirectory(directory);
            Path file1 = Files.createFile(Path.of("test\\test1.txt"));
            Path file2 = Files.createFile(Path.of("test\\test2.txt"));
            Path file3 = Files.createFile(Path.of("test\\test3.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)) {
            for (Path path : files) {
                System.out.println(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
