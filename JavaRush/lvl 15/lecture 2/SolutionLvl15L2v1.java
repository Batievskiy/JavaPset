// wrap part of code into try-catch handling with "NumberFormatException"
// if entered not whole number - print out "must enter whole number"
// and use continue for a loop

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class SolutionLvl15L2v1 {

    public static final String PROMPT_STRING = "Enter student number, or exit to exit: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Answer -> ";
    public static final String NOT_EXIST = "There is no student with this number";
    public static final String INTEGER_REQUIRED = "You need to enter an integer";
    public static final Scanner SC = new Scanner(System.in);

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
            String input = SC.nextLine().trim();

            if (input.equalsIgnoreCase(EXIT)) {
                break;
            }

            int studentID;
            try {
                studentID = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println(INTEGER_REQUIRED);
                continue;
            }
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentID));
            } catch (Exception e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
