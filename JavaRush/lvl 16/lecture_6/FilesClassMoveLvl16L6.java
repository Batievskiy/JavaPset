import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FilesClassMoveLvl16L6 {
    public static void main(String[] args) {
        try {
            // creating a new file
            Path file = Files.createFile(Path.of("test.txt"));

            // moving it to another directory and rename
            Path path2 = Path.of("d:\\test-moved.txt");
            Files.move(file, path2);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
