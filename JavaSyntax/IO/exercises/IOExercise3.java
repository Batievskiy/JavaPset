// 3. Write a Java program
// to check if a file or directory
// specified by pathname exists or not.

import java.io.File;

public class IOExercise3 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        if (file.exists()) {
            System.out.println("file or directory exists");
        } else {
            System.out.println("file or directory does not exist");
        }
    }
}
