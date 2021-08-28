// 12. Write a Java program
// to read a plain text file

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IOExercise12 {
    public static void main(String[] args) {
        String strLine;
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));) {
            while (br.ready()) {
                strLine = br.readLine();
                System.out.println(strLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
