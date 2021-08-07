// JavRush lvl 16 lecture 3 problem
// create program to rear filename from console
// read all lines from this file using method readAllLines(Path)

import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;

public class SolutionLvl16L3v0 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        List<String> lines = Files.readAllLines(Path.of(path));
        printFile(lines, path);
    }

    public static void printFile(List<String> lines, String path) {
        for (int i = 0; i < lines.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(lines.get(i));
            }
        }
    }
}
