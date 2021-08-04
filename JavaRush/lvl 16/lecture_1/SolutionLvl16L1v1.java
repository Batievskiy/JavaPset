// JavaRush lvl 16 lecture 1 problem
// rewrite code using try-with-resource
// make an object declaration in curly braces

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionLvl16L1v1 {
    public static void main(String[] args) {
//        try {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String line = reader.readLine();
//            System.out.println(line.toLowerCase());
//            reader.close();
//        } catch (IOException e) {
//            System.out.println("Exception -> " + e);
//        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
           String line = reader.readLine();
            System.out.println(line.toLowerCase());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong -> " + e);
        }
    }
}
