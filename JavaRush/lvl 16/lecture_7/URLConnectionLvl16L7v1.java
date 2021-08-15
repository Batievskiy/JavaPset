import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;

public class URLConnectionLvl16L7v1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com");

        URLConnection connection = url.openConnection();

        // sending data
        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output)) {
            sender.println("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // reading data
        try (InputStream input = connection.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
