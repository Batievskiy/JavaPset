// JavaRush lvl 16 lecture 3 problem
// change program using BufferedReader instead Scanner

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class SolutionLvl16L3v1 {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader buffer = new BufferedReader(reader)
             /* Scanner sc = new Scanner(stream) */) {
            /* String line = sc.nextLine(); */
            String line = buffer.readLine();
            char[] chars = line.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
