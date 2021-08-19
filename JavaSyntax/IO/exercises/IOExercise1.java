// 1. Write a Java program
// to get a list of all file/directory names
// from the given.

import java.io.File;

public class IOExercise1 {
    public static void main(String[] args) {
        File file = new File("D:\\downl\\");
        String[] fileList = file.list();
        if (fileList != null) {
            for (String name : fileList) {
                System.out.println(name);
            }
        }
    }
}
