import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionLvl16L7v0 {
    public static void main(String[] args) throws IOException {
        // creating object URL with a path ro a web page
        URL url = new URL("https://www.google.com/");

        // creating two ways connection
        URLConnection connection = url.openConnection();

        // getting stream from output
        OutputStream output = connection.getOutputStream();
        // write data into
        output.write(1);

        // getting stream from input
        InputStream input = connection.getInputStream();
        // reading data from it
        int data = input.read();
    }
}
