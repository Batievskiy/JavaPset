import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class WriterLvl16L4 {
    public static void main(String[] args) {
        String src = "input.txt";
        String dest = "output.txt";

        try (FileReader reader = new FileReader(src);
             FileWriter writer = new FileWriter(dest)) {
            char[] buffer = new char[65536];
            while (reader.ready()) {
                int real = reader.read(buffer);
                writer.write(buffer, 0, real);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        StringWriter stringWriter = new StringWriter();
        stringWriter.write("NEW STRING");
        stringWriter.write(" -> ");
        stringWriter.write(String.valueOf(777));

        String result = stringWriter.toString();
        System.out.println(result);
    }
}
