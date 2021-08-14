// JavaRush lvl 16 lecture 6 problem
// create program to check is path to file or to directory
// and print out an answer
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SolutionLvl16L6v0 {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            if (Files.isRegularFile(Path.of(str))) {
                System.out.println(str + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(str))) {
                System.out.println(str + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }

//    private static final Scanner sc = new Scanner(System.in);
//    private static final String THIS_IS_FILE = " - это файл";
//    private static final String THIS_IS_DIR = " - это директория";
//
//    public static void main(String[] args) {
//        String path = sc.nextLine().trim();
//        checkPath(path);
//    }
//
//    private static void checkPath(String str) {
//        boolean isFile = Files.isRegularFile(Path.of(str));
//        boolean isDirectory = Files.isDirectory(Path.of(str));
//        System.out.println("checked");
//        System.out.println(str);
//        System.out.println("isFile -> " + isFile);
//        System.out.println("isDirectory -> " + isDirectory);
//        if (isFile) {
//            System.out.println(str + THIS_IS_FILE);
//        } else if (isDirectory) {
//            System.out.println(str + THIS_IS_DIR);
//        } else {
//            System.exit(0);
//        }
//    }
}
