package ua.com.alevel.view;

import ua.com.alevel.entity.User;
import ua.com.alevel.service.UserService;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
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
    private static final String WRONG_CHOICE = "\n---> There is NO such choice in the menu.\n---> Try again ;)";

    private final UserService userService = new UserService();

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
                case "5" -> findAll(bufferedReader);
                case "q", "й" -> {
                    System.out.println(BYE_BYE);
                    System.exit(0);
                }
                default -> System.out.println(WRONG_CHOICE);
            }
        }
    }

    private void create(BufferedReader bufferedReader) {
        System.out.println("UserController.create");
        try {
            System.out.print("enter user's name: ");
            String nameString = bufferedReader.readLine();

            System.out.print("enter user's age: ");
            String ageString = bufferedReader.readLine();
            int age = Integer.parseInt(ageString);

            User user = new User();
            user.setName(nameString);
            user.setAge(age);
            userService.create(user);
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    private void update(BufferedReader bufferedReader) {
        System.out.println("UserController.update");
        try {
            System.out.print("enter user's id: ");
            String id = bufferedReader.readLine();
            System.out.print("enter user's name: ");
            String nameString = bufferedReader.readLine();
            System.out.print("enter user's age: ");
            String ageString = bufferedReader.readLine();
            int age = Integer.parseInt(ageString);

            User user = new User();
            user.setId(id);
            user.setName(nameString);
            user.setAge(age);
            userService.create(user);
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    private void delete(BufferedReader bufferedReader) {
        System.out.println("UserController.delete");
        try {
            System.out.print("enter user's id: ");
            String id = bufferedReader.readLine();
            userService.delete(id);
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    private void findById(BufferedReader bufferedReader) {
        System.out.println("UserController.findById");
        try {
            System.out.print("enter user's id: ");
            String id = bufferedReader.readLine();

            User user = userService.findById(id);
            System.out.println("user = " + user);
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    private void findAll(BufferedReader bufferedReader) {
        System.out.println("UserController.findAll");
        List<User> usersList = userService.findAll();
        if (usersList != null && usersList.size() != 0) {
            for (User currentUser : usersList) {
                System.out.println("user = " + currentUser);
            }
        }
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
