// JavaRush lvl 15 lecture 2 problem
// catch ArrayIndexOutOfBounds exception

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class SolutionLvl15L2 {

    public static final String PROMPT_STRING = "Enter student number, or exit to exit: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Answering -> ";
    public static final String NOT_EXIST = "There is no student with this number.";
    public static final Scanner sc = new Scanner(System.in);

    static List<String> studentsJournal = Arrays.asList(
            "Timur Myasnoy"
            , "Penelope Sivolap"
            , "Orest Zlobin"
            , "Irida Produvalova"
            , "Hector Gadyukin"
            , "Electra Chemodanova"
            , "Guidon Nedumov"
            , "Roxana Borisenko"
            , "Julian Mumbrikov"
            , "Siegfried Goremykin");

    public static void main(String[] args) {
        while (true) {
            System.out.print(PROMPT_STRING);
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase(EXIT)) {
                break;
            }
            int studentId = Integer.parseInt(input);
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
