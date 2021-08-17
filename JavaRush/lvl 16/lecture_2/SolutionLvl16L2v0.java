// write program that reads path to file1 and path to file2
// and write all bytes from file1 to file2, but changing its position
// at such principals: first byte with second byte, third byte with forth byte
// if the very last byte in the file1 is odd - writing this byte as it.
// use newInputStream and newOutputStream of class Files

import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class SolutionLvl16L2v0 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             var inputStream = Files.newInputStream(Path.of(sc.nextLine().trim()));
             var outputStream = Files.newOutputStream(Path.of(sc.nextLine().trim()))) {
            byte[] bytesIn = inputStream.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];

            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
            }
            outputStream.write(bytesOut);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
