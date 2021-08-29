import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class FilesToUpperJRLvl16L8 {
    public static void main(String[] args) throws IOException {
        List<String> stringList = Files.readAllLines(Paths.get("input.txt"));

        List<String> resultList = new ArrayList<>();

        for (String line : stringList) {

            if (line.startsWith("Java")) {
                String upper = line.toUpperCase();
                resultList.add(upper);
            }
        }

        for (String line : resultList) {
            System.out.println(line);
        }
    }
}
