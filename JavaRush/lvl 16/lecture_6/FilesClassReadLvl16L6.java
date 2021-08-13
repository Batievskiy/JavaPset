import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesClassReadLvl16L6 {
    public static void main(String[] args) {
        try {
            // creating a file
            Path file = Files.createFile(Path.of("test.txt"));
            String text = "Hello, Java World";
            Files.write(file, text.getBytes());

            // reading a file
            List<String> list = Files.readAllLines(file);
            for (String string : list) {
                System.out.println(string);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
