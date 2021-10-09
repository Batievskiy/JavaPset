// Read a file path in console.
// Print the contents of a file to the console.
// Free up the resources. Close stream from a file nd stream from keyboard.

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class SolutionLvl3L11v2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner sc = new Scanner(fileInputStream);
        StringBuilder stringBuilder = new StringBuilder();

        while (sc.hasNextLine()) {
            stringBuilder.append(sc.nextLine()).append("\n");
        }

        System.out.println(stringBuilder.toString());

        sc.close();
        bufferedReader.close();
        fileInputStream.close();
    }
}
