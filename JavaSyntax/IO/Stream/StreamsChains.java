import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.stream.Collectors;

public class StreamsChains {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("input.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String allLines = bufferedReader
                    .lines()
                    .collect(Collectors
                            .joining(", "));
            System.out.println(allLines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
