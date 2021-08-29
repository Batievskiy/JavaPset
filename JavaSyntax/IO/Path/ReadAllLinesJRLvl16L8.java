import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class ReadAllLinesJRLvl16L8 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("input.txt");

        List<String> stringList = Files.readAllLines(filePath);

        // print out all lines using for-each loop
        for (String line : stringList) {
            System.out.println(line);
        }
    }
}
