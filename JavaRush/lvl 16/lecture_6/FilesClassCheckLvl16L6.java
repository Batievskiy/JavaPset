import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesClassCheckLvl16L6 {
    public static void main(String[] args) {
        try {
            // creating a file
            Path file = Files.createFile(Path.of("test.txt"));

            // check is it regular file
            System.out.println(".isRegularFile() -> " +
                    Files.isRegularFile(file));

            // check is it directory
            System.out.println(".isDirectory() -> " +
                    Files.isDirectory(file));

            // check is file exist
            System.out.println(".exists() -> " +
                    Files.exists(file));

            // check file size
            System.out.println(".size() -> " +
                    Files.size(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
