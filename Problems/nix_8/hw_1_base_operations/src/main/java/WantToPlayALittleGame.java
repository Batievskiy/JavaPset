import hw_1.CountAllLatinCyrillicCharsInString;
import hw_1.FindLessonEndTime;
import hw_1.SumOfNumbersInTheString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class WantToPlayALittleGame {
    private static final String WANT_TO_PLAY_A_LITTLE_GAME = "\n---< Want to play a Little Game? >---\n";
    private static final String SUM_ALL_DIGITS_IN_STRING = "[ 1 ] SUM ALL DIGITS in the string.";
    private static final String COUNT_ALL_LATIN_CYRILLIC_CHARS_IN_STRING = "[ 2 ] COUNT ALL LATIN/CYRILLIC CHARS in the string.";
    private static final String FIND_LESSON_END_TIME = "[ 3 ] FIND a LESSON END TIME by its number (from 1 to 10)";
    private static final String QUIT = "[ Q ] QUIT.";
    private static final String YOUR_CHOICE = "\nYour choice is -> ";
    private static final String WRONG_CHOICE = "\n---> There is NO such choice in the menu.\n---> Try again ;)";
    private static final String BYE_BYE = "\nBye-Bye ;)\n";

    public static void playALittleGame() {

        gamesToPlayMenu();

        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in)
        )) {
            String gameToPlay;
            while ((gameToPlay = bufferedReader.readLine()) != null) {
                switch (gameToPlay.toLowerCase(Locale.ROOT)) {
                    case "1" -> {
                        SumOfNumbersInTheString.run();
                        gamesToPlayMenu();
                    }
                    case "2" -> {
                        CountAllLatinCyrillicCharsInString.run();
                        gamesToPlayMenu();
                    }
                    case "3" -> {
                        FindLessonEndTime.run();
                        gamesToPlayMenu();
                    }
                    case "q" -> {
                        System.out.println(BYE_BYE);
                        System.exit(0);
                    }
                    default -> {
                        System.out.println(WRONG_CHOICE);
                        gamesToPlayMenu();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void gamesToPlayMenu() {
        System.out.println(WANT_TO_PLAY_A_LITTLE_GAME);
        System.out.println(SUM_ALL_DIGITS_IN_STRING);
        System.out.println(COUNT_ALL_LATIN_CYRILLIC_CHARS_IN_STRING);
        System.out.println(FIND_LESSON_END_TIME);
        System.out.println(QUIT);
        System.out.print(YOUR_CHOICE);
    }
}
