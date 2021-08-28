// 13. Write a java program
// to read a file line by line
// and store it into a variable.

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class IOExercise13 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String line;
        try (FileReader fileReader = new FileReader("input.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (bufferedReader.ready()) {
                line = bufferedReader.readLine();
                arrayList.add(line);
            }
            System.out.println(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
