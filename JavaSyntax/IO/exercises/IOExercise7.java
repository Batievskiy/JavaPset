import java.io.File;
import java.sql.Date;

// 7. Write a Java program
// to get last modified time of a file
public class IOExercise7 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        Date date = new Date(file.lastModified());
        System.out.println("the file:\n" + file.getAbsolutePath()
                + "\nwas last modified on: " + date);
    }
}
