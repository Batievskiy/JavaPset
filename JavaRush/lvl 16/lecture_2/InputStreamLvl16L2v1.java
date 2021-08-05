import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamLvl16L2v1 {
    public static void main(String[] args) {
        String src = "log.txt";
        String dest = "copy.txt";

        try {
            FileInputStream input = new FileInputStream(src);
            FileOutputStream output = new FileOutputStream(dest);

            byte[] buffer = new byte[65536]; // 64 kb
            while (input.available() > 0) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
