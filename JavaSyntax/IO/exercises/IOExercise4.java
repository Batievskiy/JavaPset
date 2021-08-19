// 4. Write a Java program
// to check if a file or directory
// has read and write permission

import java.io.File;

public class IOExercise4 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        if (file.canWrite()) {
            System.out.println(file.getAbsolutePath() + " can write");
        } else {
            System.out.println(file.getAbsolutePath() + " cannot write");
        }
        if (file.canRead()) {
            System.out.println(file.getAbsolutePath() + " can read");
        } else {
            System.out.println(file.getAbsolutePath() + " cannot read");
        }
    }
}
