// methods parseInt() and get() can throws an exceptions:
// NumberFormatException -> must print out "You need to enter an integer"
// ArrayIndexOutOfBoundsException -> must print out "There is no student with this number"
// handle this problem

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolutionLvl15L2v2 {

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

            try {
                String input = "";
                System.out.println(PROMPT_STRING);
                input = SC.nextLine();
                if (input.equalsIgnoreCase(EXIT)) {
                    break;
                }
                int studentID = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentID));
            } catch (NumberFormatException e) {
                System.out.println(INTEGER_REQUIRED);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
