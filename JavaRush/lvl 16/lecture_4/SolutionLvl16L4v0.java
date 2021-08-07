import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;

// JavaRush lvl 16 lecture 4 problem
// correct program
public class SolutionLvl16L4v0 {
    public static void main(String[] args) {
        byte[] bytes = args[0].getBytes();

//        try (InputStream stream = System.in;
//            Scanner scanner = new Scanner(stream);
//            BufferedWriter bufferWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
//            bufferWriter.write(bytes);
//        } catch (IOException e) {
//            System.out.println("something went wrong : " + e);
//        }

        Scanner scanner = new Scanner(System.in);
        try {
            Files.write(Path.of(scanner.nextLine()), bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
