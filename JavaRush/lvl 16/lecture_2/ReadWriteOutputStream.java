import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ReadWriteOutputStream {
    public static void main(String[] args) {
        String src = "test.txt";
        String out = "out.txt";

        // create a file and write some text into
        try (FileOutputStream srcFile = new FileOutputStream(src)) {
            String text = "enter some text here...";
            byte[] buffer = text.getBytes();
            srcFile.write(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // read this file data and write it to another file
        try (FileInputStream input = new FileInputStream(src);
             FileOutputStream output = new FileOutputStream(out)) {
            byte[] buffer = input.readAllBytes();
            output.write(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // read new file data and print it out
        try (FileReader in = new FileReader(out);
             BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
