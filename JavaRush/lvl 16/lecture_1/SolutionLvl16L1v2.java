// change code using try-with-resource
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;


public class SolutionLvl16L1v1 {
    public static void main(String[] args) throws IOException{
//        Scanner sc = null;
//        BufferedReader bufferedReader = null;
//        try {
//            sc = new Scanner(System.in);
//            String fileName = sc.nextLine().trim();
//            bufferedReader = Files.newBufferedReader(Path.of(fileName));
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Something went wrong :" + e);
//        } finally {
//            if (sc != null) {
//                sc.close();
//            }
//            if (bufferedReader != null) {
//                bufferedReader.close();
//            }
//        }
        try (Scanner sc = new Scanner(System.in);
            BufferedReader bufferedReader = Files.newBufferedReader(Path.of(sc.nextLine().trim()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
