// 5. Write a Java program
// to check if given pathname
// is a directory or a file.

import java.io.File;

public class IOExercise5 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        if (file.isDirectory()) {
            System.out.println(file.getAbsolutePath() + " is a directory");
        } else {
            System.out.println(file.getAbsolutePath() + " is not a directory");
        }
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + " is a file");
        } else {
            System.out.println(file.getAbsolutePath() + " is not a file");
        }
    }
}
