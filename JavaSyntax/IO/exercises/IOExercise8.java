// 8. Write Java program to read input from java console

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExercise8 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your name: ");
        try {
            String name = reader.readLine();
            System.out.println("your name is: " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
