// JavaRush lvl 16 lecture 3

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferReaderLvl16L3 {
    public static void main(String[] args) {
        String src = "input.txt";
        try (FileReader in = new FileReader(src);
            BufferedReader reader = new BufferedReader(in)) {

            while(reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
