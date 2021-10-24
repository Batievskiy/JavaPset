package ua.com.alevel.view;

import ua.com.alevel.config.ObjectFactory;
import ua.com.alevel.entity.User;
import ua.com.alevel.service.UserService;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class UserController {
    private static InputStreamReader inputStreamReader;
    private static final String CREATE_USER = "[ 1 ] Create user";
    private static final String UPDATE_USER = "[ 2 ] Update user";
    private static final String DELETE_USER = "[ 3 ] Delete user";
    private static final String FIND_BY_ID = "[ 4 ] findById user";
    private static final String FIND_ALL = "[ 5 ] findAll users";
    private static final String QUIT = "[ Q ] QUIT.";
    private static final String YOUR_CHOICE = "\nYour choice is -> ";
    private static final String WRONG_CHOICE = "\n---> There is NO such choice in the menu.\n---> Try again ;)\n";

    private final UserService userService = ObjectFactory.getInstance().getCurrentObject(UserService.class);

    public void playALittleGame() throws IOException {

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

    private void gamesToPlayMenu() {
        System.out.println();
        System.out.println(CREATE_USER);
        System.out.println(UPDATE_USER);
        System.out.println(DELETE_USER);
        System.out.println(FIND_BY_ID);
        System.out.println(FIND_ALL);
        System.out.println(QUIT);
        System.out.print(YOUR_CHOICE);
    }

    private void setYourChoice(BufferedReader bufferedReader) throws IOException {

        String gameToPlay;

        while (true) {

            gamesToPlayMenu();

            gameToPlay = bufferedReader.readLine();
            switch (gameToPlay.toLowerCase(Locale.ROOT)) {
                case "1" -> create(bufferedReader);
                case "2" -> update(bufferedReader);
                case "3" -> delete(bufferedReader);
                case "4" -> findById(bufferedReader);
                case "5" -> findAll();
                case "q", "й" -> {
                    System.out.println(BYE_BYE);
                    System.exit(0);
                }
                default -> System.out.println(WRONG_CHOICE);
            }
        }
    }

    private static void printError(String error) {
        System.out.println("\nerror -> " + error);
    }

    private void create(BufferedReader bufferedReader) throws IOException {
        System.out.println("\n...create >---");
        try {
            String name = getName(bufferedReader);
            int age = getAge(bufferedReader);

            User user = new User();
            user.setName(name);
            user.setAge(age);
            userService.create(user);
        } catch (NullPointerException | NumberFormatException e) {
            printError(e.toString());
        }
    }

    private void update(BufferedReader bufferedReader) throws IOException {
        System.out.println("\n...update >---");
        try {
            String id = getUserId(bufferedReader);
            String name = getName(bufferedReader);
            int age = getAge(bufferedReader);

            User user = new User();
            user.setId(id);
            user.setName(name);
            user.setAge(age);
            userService.update(user);
        } catch (NullPointerException | NumberFormatException e) {
            printError(e.toString());
        }
    }

    private void delete(BufferedReader bufferedReader) throws IOException {
        System.out.println("\n...delete >---");
        try {
            String id = getUserId(bufferedReader);
            userService.delete(id);
        } catch (NullPointerException e) {
            printError(e.toString());
        }
    }

    private void findById(BufferedReader bufferedReader) throws IOException {
        System.out.println("\n...findById >---");
        try {
            String id = getUserId(bufferedReader);
            printResult(String.valueOf(userService.findById(id.trim())).trim());
        } catch (NullPointerException e) {
            printError(e.toString());
        }
    }

    private void findAll() {
        System.out.println("\n...findAll >---");
        printResult(String.valueOf(userService.findAll()).trim());
    }

    public void printResult(String str) {
        System.out.println("\n...result >---\n" + str + "\n");
    }

    public String getUserId(BufferedReader bufferedReader) throws IOException {
        String id;
        do {
            System.out.print("enter user's id -> ");
            id = bufferedReader.readLine();
        } while (id.isEmpty());
        return id;
    }

    public String getName(BufferedReader bufferedReader) throws IOException {
        String name;
        do {
            System.out.print("enter user's name -> ");
            name = bufferedReader.readLine();
        } while (name.isEmpty());
        return name;
    }

    private int getAge(BufferedReader bufferedReader) throws IOException {
        String ageString;
        int age;
        do {
            System.out.print("enter user's age (0 to 120 years) -> ");
            ageString = bufferedReader.readLine();
            if (!ageString.matches("^(12[0-0]|1[01][0-9]|[1-9]?[0-9])$")) {
                ageString = "";
            }
        } while (ageString.isEmpty());
        age = Integer.parseInt(ageString);
        return age;
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
