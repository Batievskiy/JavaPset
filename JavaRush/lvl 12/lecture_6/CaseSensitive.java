// JavaRush lvl 12 lecture 6

import java.util.Scanner;

public class CaseSensitive {
    private static final Scanner sc = new Scanner(System.in); // <--- best to use final static Scanner

    public static void main(String[] args) {
        String line = sc.nextLine();
        line.toLowerCase(); // <--- wrong way to use method ()
        System.out.println(line); // <--- does not change the original line string
        System.out.println(line.toLowerCase()); // <--- better - use inside println()
        String upperLine = line.toUpperCase(); // <--- best - to create another variable
        System.out.println(upperLine);
    }
}
