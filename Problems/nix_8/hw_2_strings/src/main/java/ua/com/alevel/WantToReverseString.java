package ua.com.alevel;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

import ua.com.alevel.reverseString.ReverseString;

public class WantToReverseString {
    private static InputStreamReader inputStreamReader;
    private static final String WANT_TO_REVERSE_STRING = "\n---< Want to Reverse String? >---\n";
    private static final String REVERSE = "[ 1 ] reverse(String sourceString)";
    private static final String REVERSE_isWORD_POSITION = "[ 2 ] reverse(String sourceString, boolean isWordsPositionPreserve)";
    private static final String REVERSE_SUBSTRING = "[ 3 ] reverse(String sourceString, String substring)";
    //    private static final String REVERSE_START_INDEX = "[ 4 ] reverse(String sourceString, int startIndex)";
    //    private static final String REVERSE_START_END_INDEX = "[ 5 ] reverse(String sourceString, int startIndex, int endIndex)";
    private static final String REVERSE_START_END_INDEX_isINCLUSIVE = "[ 6 ] reverse(String sourceString, int startIndex, int endIndex, boolean isInclusive)";
    //    private static final String REVERSE_START_END_CHAR_isINCLUSIVE = "[ 7 ] reverse(String sourceString, char startChar, char endChar, boolean isInclusive)";
    private static final String REVERSE_START_END_SUBSTRING_isINCLUSIVE = "[ 8 ] reverse(String sourceString, String startSubstring, String endSubstring, boolean isInclusive)";
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
        System.out.println(WANT_TO_REVERSE_STRING);
        System.out.println(REVERSE);
        System.out.println(REVERSE_isWORD_POSITION);
        System.out.println(REVERSE_SUBSTRING);
        System.out.println(REVERSE_START_END_INDEX_isINCLUSIVE);
        System.out.println(REVERSE_START_END_SUBSTRING_isINCLUSIVE);
        System.out.println(QUIT);
        System.out.print(YOUR_CHOICE);
    }

    private static void setYourChoice(BufferedReader bufferedReader) throws IOException {

        String reverseToPlay;

        while (true) {

            gamesToPlayMenu();

            reverseToPlay = bufferedReader.readLine();

            // TODO - How to refactor this MESS and make it proper way???
            switch (reverseToPlay.toLowerCase()) {
                case "1" -> {
                    String sourceString = getSourceString(bufferedReader);
                    String result = ReverseString.reverse(sourceString);
                    System.out.println("\nresult -> " + result);
                }
                case "2" -> {
                    String sourceString = getSourceString(bufferedReader);
                    String prompt = "isWordsPositionPreserve (true / false) -> ";
                    boolean isWordsPositionPreserve = getBool(bufferedReader, prompt);
                    String result = ReverseString.reverse(sourceString, isWordsPositionPreserve);
                    System.out.println("\nresult -> " + result);
                }
                case "3" -> {
                    String sourceString = getSourceString(bufferedReader);
                    System.out.print("enter subString -> ");
                    String subString = bufferedReader.readLine();
                    String result;
                    try {
                        result = ReverseString.reverse(sourceString, subString);
                    } catch (Exception e) {
                        System.out.println("error: " + e);
                        result = e.toString();
                    }
                    System.out.println("\nresult -> " + result);
                }
                case "6" -> {
                    String sourceString = getSourceString(bufferedReader);
                    String startIndexPrompt = "startIndex -> ";
                    int startIndex = getInt(bufferedReader, startIndexPrompt);
                    String endIndexPrompt = "endIndex -> ";
                    int endIndex = getInt(bufferedReader, endIndexPrompt);
                    String booleanPrompt = "isInclusive (true / false) -> ";
                    boolean isInclusive = getBool(bufferedReader, booleanPrompt);
                    String result;
                    try {
                        result = ReverseString.reverse(sourceString, startIndex, endIndex, isInclusive);
                    } catch (Exception e) {
                        System.out.println("error: " + e);
                        result = e.toString();
                    }
                    System.out.println("\nresult -> " + result);
                }
                case "8" -> {
                    String sourceString = getSourceString(bufferedReader);
                    System.out.print("startSubstring -> ");
                    String startSubstring = bufferedReader.readLine();
                    System.out.print("endSubstring -> ");
                    String endSubstring = bufferedReader.readLine();
                    String booleanPrompt = "isInclusive (true / false) -> ";
                    boolean isInclusive = getBool(bufferedReader, booleanPrompt);
                    String result;
                    try {
                        result = ReverseString.reverse(sourceString, startSubstring, endSubstring, isInclusive);
                    } catch (Exception e) {
                        System.out.println("error: " + e);
                        result = e.toString();
                    }
                    System.out.println("\nresult -> " + result);
                }
                case "q", "й" -> {
                    System.out.println(BYE_BYE);
                    System.exit(0);
                }
                default -> System.out.println(WRONG_CHOICE);
            }
        }
    }

    private static String getSourceString(BufferedReader bufferedReader) throws IOException {
        System.out.print("enter sourceString -> ");
        return bufferedReader.readLine();
    }

    private static boolean getBool(BufferedReader bufferedReader, String prompt) throws IOException {
        String boolString;
        do {
            System.out.print(prompt);
            boolString = bufferedReader.readLine();
        } while (!boolString.matches("(true)|(false)"));
        return Boolean.parseBoolean(boolString);
    }

    private static int getInt(BufferedReader bufferedReader, String prompt) throws IOException {
        String intString;
        do {
            System.out.print(prompt);
            intString = bufferedReader.readLine();
        } while (!intString.matches("\\d+"));
        return Integer.parseInt(intString);
    }

    private static void setConsoleCharSet() throws UnsupportedEncodingException {
        String charSetName;
        // create current console object
        Console currentConsole = System.console();
        // and check it for null or Windows console
        if (currentConsole != null && System.getProperty("os.name").toLowerCase().contains("windows")) {
            // get charset name from currentConsole object
            charSetName = currentConsole.charset().name();
            // and setting system out according this charset autoFlush true
            System.setOut(new PrintStream(System.out, true, charSetName));
            // and setting current inputStreamReader using came sharSetName
            inputStreamReader = new InputStreamReader(System.in, charSetName);
        } else {
            // if current console is null then stay on charset UTF-8 autoFlush true
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
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
