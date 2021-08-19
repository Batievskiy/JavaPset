// 9. Write a Java program to get file size in bytes, kb, mb.

import java.io.File;

public class IOExercise9 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        if (file.exists()) {
            System.out.println(fileSizeInBytes(file));
            System.out.println(fileSizeInKilobytes(file));
            System.out.println(fileSizeInMegabytes(file));
        } else {
            System.out.println("file does not exist");
        }
    }

    private static String fileSizeInMegabytes(File file) {
        return (double) file.length() / (1024 * 1024) + " mb";
    }

    private static String fileSizeInKilobytes(File file) {
        return (double) file.length() / 1024 + " kb";
    }

    private static String fileSizeInBytes(File file) {
        return file.length() + " bytes";
    }
}
