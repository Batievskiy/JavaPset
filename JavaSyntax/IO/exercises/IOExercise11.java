// 11. Write a Java program
// to read a file content line by line.

import java.io.FileReader;
import java.io.BufferedReader;

public class IOExercise11 {
    public static void main(String[] args) {

        try (FileReader fileName = new FileReader("input.txt");
             BufferedReader bufferedReader = new BufferedReader(fileName)) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
