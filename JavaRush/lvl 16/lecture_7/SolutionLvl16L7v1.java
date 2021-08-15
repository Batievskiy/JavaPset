// create program to access public API and get data
// and print it out in console

import java.io.IOException;
import java.net.URL;
import java.io.InputStream;

public class SolutionLvl16L7v1 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream input = url.openStream();

        byte[] buffer = input.readAllBytes();
        String s1 = new String(buffer);
        System.out.println(s1);
    }
}
