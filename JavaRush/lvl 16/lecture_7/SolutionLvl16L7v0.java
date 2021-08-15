// JavaRush lvl 16 lecture 7 problem
// create program that read web link from console
// and downloads this file and save it in temp file

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SolutionLvl16L7v0 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String link = sc.nextLine().trim();
        URL url = new URL(link);
        InputStream input = url.openStream();

        Path tempFile = Files.createTempFile(null, null);
        Files.write(tempFile, input.readAllBytes());
    }
}
