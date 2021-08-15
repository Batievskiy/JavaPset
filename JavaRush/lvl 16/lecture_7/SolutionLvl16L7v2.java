// create program to access public API
// send and get data and print it out in console

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionLvl16L7v2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output)) {
            sender.println("hello");
        }

        try (InputStream input = connection.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}
