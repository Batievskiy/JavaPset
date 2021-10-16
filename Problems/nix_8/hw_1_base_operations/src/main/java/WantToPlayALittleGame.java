package ua.com.alevel;

import ua.com.alevel.countAllLatinCyrillicCharsInString.CountAllLatinCyrillicCharsInString;
import ua.com.alevel.findLessonEndTime.FindLessonEndTime;
import ua.com.alevel.sumOfNumbersInTheString.SumOfNumbersInTheString;
import ua.com.alevel.interfaces.GameInterface;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Console;
import java.io.PrintStream;
import java.util.Locale;

public class WantToPlayALittleGame {
    private static InputStreamReader inputStreamReader;
    private static final String WANT_TO_PLAY_A_LITTLE_GAME = "\n---< Want to play a Little Game? >---\n";
    private static final String SUM_ALL_DIGITS_IN_STRING = "[ 1 ] SUM ALL DIGITS in the string.";
    private static final String COUNT_ALL_LATIN_CYRILLIC_CHARS_IN_STRING = "[ 2 ] COUNT ALL LATIN/CYRILLIC CHARS in the string.";
    private static final String FIND_LESSON_END_TIME = "[ 3 ] FIND a LESSON END TIME by its number (from 1 to 10)";
    private static final String QUIT = "[ Q ] QUIT.";
    private static final String YOUR_CHOICE = "\nYour choice is -> ";
    private static final String WRONG_CHOICE = "\n---> There is NO such choice in the menu.\n---> Try again ;)";
    private static final String WANT_MORE = "\nWant more? ( Y / N ) - > ";

    public static void playALittleGame() throws IOException {

        setConsoleCharSet();

        System.out.println(nix_8);

        try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            setYourChoice(bufferedReader);
        } catch (IOException e) {
            // I don't know how to deal with an Exceptions in proper way :(
            // so... rethrow.
            throw e;
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

    private static void setYourChoice(BufferedReader bufferedReader) throws IOException {

        String gameToPlay;

        while (true) {

            gamesToPlayMenu();

            gameToPlay = bufferedReader.readLine();
            switch (gameToPlay.toLowerCase(Locale.ROOT)) {
                case "1" -> playSelectedGame(bufferedReader, new SumOfNumbersInTheString());
                case "2" -> playSelectedGame(bufferedReader, new CountAllLatinCyrillicCharsInString());
                case "3" -> playSelectedGame(bufferedReader, new FindLessonEndTime());
                case "q", "й" -> {
                    System.out.println(BYE_BYE);
                    System.exit(0);
                }
                default -> System.out.println(WRONG_CHOICE);
            }
        }
    }

    public static boolean isWantMore(String gameToPlay) {
        return gameToPlay.equalsIgnoreCase("y") || gameToPlay.equalsIgnoreCase("н");
    }


    private static void playSelectedGame(BufferedReader bufferedReader, GameInterface playableGame) throws IOException {
        String gameToPlay;

        // let's loop the game to chose
        do {
            playableGame.play(bufferedReader);
            System.out.print(WANT_MORE);
            gameToPlay = bufferedReader.readLine();
        } while (isWantMore(gameToPlay));
    }

    private static void setConsoleCharSet() throws UnsupportedEncodingException {
        // SOLUTION HERE - https://newbedev.com/java-how-to-detect-and-change-encoding-of-system-console
        String charSetName;
        // create current console object
        Console currentConsole = System.console();
        // and check it for null
        if (currentConsole != null) {
            // get charset name from currentConsole object
            charSetName = currentConsole.charset().name();
            // and setting system out according this charset autoFlush true
            System.setOut(new PrintStream(System.out, true, charSetName));
            // and setting current inputStreamReader using came sharSetName
            inputStreamReader = new InputStreamReader(System.in, charSetName);
        } else {
            // if current console is null then stay on current charset
            inputStreamReader = new InputStreamReader(System.in);
        }
    }

    private static final String nix_8 =
            """
                                                                                                                             \s
                                                         .###,                                                               \s
                                                        %%%%%%%                                                              \s
                                                        #%%%%%%                                                              \s
                                                          ^^^                                                                \s
                                      ___.                                                                     ___.          \s
                          /%%%%%  #%%%%%%%%%%%.         *%%%%%(       %%#                 #%#              /%%%%%%%%%.       \s
                          /%%%%%#%%%%##%%%%%%%%%        *%%%%%(       %%%%%#           #%%%%#           /%%%%%%<~>%%%%%(     \s
                          /%%%%%%%        #%%%%%#       *%%%%%(       #%%%%%%%(     #%%%%%%%(          /%%%%(      ~%%%%(    \s
                          /%%%%%%          %%%%%%       *%%%%%(          %%%%%%%#(%%%%%%%(              /%%%%(     %%%%(     \s
                          /%%%%%(          %%%%%%       *%%%%%(             #%(((((((%#                    /%%%%%%%%%#       \s
                          /%%%%%(          %%%%%%       *%%%%%(            ((((((((((((/                /%%%%%*****%%%%%/    \s
                          /%%%%%(          %%%%%%       *%%%%%(         ((((((((/ ((((((((/           /%%%%%(        %%%%%(  \s
                          /%%%%%(          %%%%%%       *%%%%%(       (/                   //         /%%%%(         %%%%%(  \s
                          /%%%%%(          %%%%%%       *%%%%%(       (((((((/       (((((((/          /%%%%%(_____(%%%%%(   \s
                          /%%%%%(          %%%%%%       *%%%%%(       ((((/             ((((/             /%%%%%%%%%%%%%/    \s
                                                                                              %%%%%%%%%%                     \s
                    """;
    private static final String BYE_BYE =
            """
                                                                                                                             \s
                          /%%%%%%%%%.   /%%(        /%%(   /%%%%%%%%%.         /%%%%%%%%%.   /%%(        /%%(  /%%%%%%%%%.   \s
                          /%%(     #%%    /%%(    /%%(     /%%(                /%%(     #%%    /%%(    /%%(    /%%(          \s
                          /%%(     #%%       /%%#%(        /%%(                /%%(     #%%       /%%#%(       /%%(          \s
                          /%%%%%%%%(          /%%(         /%%%%%%%%(   /%%(   /%%%%%%%%(          /%%(        /%%%%%%%%(    \s
                          /%%(     #%%        /%%(         /%%(                /%%(     #%%        /%%(        /%%(          \s
                          /%%(     #%%        /%%(         /%%(                /%%(     #%%        /%%(        /%%(          \s
                          /%%%%%%%%%.         /%%(         /%%%%%%%%%.         /%%%%%%%%%.         /%%(        /%%%%%%%%%.   \s
                                      
                    """;
}
