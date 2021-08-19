// 2. Write a Java program
// to get specific files by extensions
// from a specified folder.

import java.io.File;
import java.io.FilenameFilter;

public class IOExercise2 {
    public static void main(String[] args) {
        File file = new File("D:\\downl\\");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".pdf")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String f : list) {
            System.out.println(f);
        }
    }
}
