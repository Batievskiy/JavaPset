import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OutputStreamLvl16L4v1 {
    public static void main(String[] args) {
        String src = "input.txt";
        String dest = "output.txt";

        try (FileInputStream input = new FileInputStream(src);
        FileOutputStream output = new FileOutputStream(dest)) {
            byte[] buffer = new byte[65536];
            while (input.available() > 0) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
