import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

// find an error and correct the program
public class SolutionLvl16L2v1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             var inputStream = Files.newInputStream(Path.of(sc.nextLine().trim()));
             var outputStream = Files.newOutputStream(Path.of(sc.nextLine().trim()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
//                int read = inputStream.read();
                int read = inputStream.read(buffer);
//                outputStream.write(buffer, size, read);
                outputStream.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
