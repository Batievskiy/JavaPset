import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URLClassLvl16L7v0 {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.google.com/");
        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);
    }
}
