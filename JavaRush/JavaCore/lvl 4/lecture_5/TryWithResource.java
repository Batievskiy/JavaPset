import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class TryWithResource {
    public static void main(String[] args) {
        Path filePath = Path.of("input.txt");
        readLinesFromFile(filePath);
    }

    private static void readLinesFromFile(Path filePath) {
        String line;
        // auto-close resource try with resource block
        try (BufferedReader br = new BufferedReader(
                new FileReader(filePath.toString())
        )) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
