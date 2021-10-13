/*
 * 1. Read a fileName from console.
 * 2. Create and use BufferedReader.
 * 3. Read lines from console until "exit".
 * 4. Write all lines + "exit" in a file
 * (each line from new line)
 * 5. Close BufferedReader.
 * 6. Don't print out anything.
 */

import java.io.*;

public class SolutionLvl3L11v3 {
    private static final String FILE_NAME = "Enter a fileName -> ";
    private static final String LINE_PROMPT = "Enter a line (\"exit\" to quit) -> ";

    public static void main(String[] args) {

        writeLinesToFile();

    }

    private static void writeLinesToFile() {
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(getLine(FILE_NAME, bufferedReader));
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            String str;
            do {
                str = getLine(LINE_PROMPT, bufferedReader);
                bufferedWriter.write(str + "\n");
            } while (!str.equalsIgnoreCase("exit"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getLine(String prompt, BufferedReader bufferedReader) {
        String str = "";
        try {
            while (str.isEmpty()) {
//                System.out.print(prompt);
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
