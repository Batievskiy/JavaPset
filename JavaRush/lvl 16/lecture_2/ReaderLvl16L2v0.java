import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
public class ReaderLvl16L2v0 {

    // It is an abstract class for reading character streams.

    public static void main(String[] args) {
        String src = "input.txt";
        String dest = "copy.txt";

        try {
            FileReader reader = new FileReader(src);
            FileWriter writer = new FileWriter(dest);

            char[] buffer = new char[65536];
            while (reader.ready()) {
                int real = reader.read(buffer);
                writer.write(buffer, 0, real);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
