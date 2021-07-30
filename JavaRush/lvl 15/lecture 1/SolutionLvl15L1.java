import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionLvl15L1 {
    public static final String INPUT_NAME = "\nEnter name: ";
    public static final String INPUT_AGE = "Enter age of user '%s': ";

    public static final String NAME_CANNOT_BE_NULL = "Name can not be null!";
    public static final String NAME_CANNOT_BE_EMPTY = "Name can not be empty!";
    public static final String NAME_CANNOT_CONTAIN_DIGIT = "Name can not contain digits!";

    public static final String AGE_CANNOT_BE_NEGATIVE = "Age can not be less than 0!";
    public static final String AGE_CANNOT_BE_TOO_BIG = "Age can not be more than 150!";
    public static final String UNKNOWN_ERROR = "UNKNOWN ERROR!";

    public static final String FOUND = "\nUser '%s' has been found at index %d.\n";
    public static final String NOT_FOUND = "\nUser '%s' NOT Found!\n";

    static List<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i =0; i < 5; i++) {
            addUser(new User());
        }
        User userToSearch = new User();
        userToSearch.setName("Raphael");
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = sc.nextLine().trim();

        System.out.print(INPUT_AGE);
        int age = Integer.parseInt(sc.nextLine().trim());

        int checkName = user.setName(name);
        if (checkName == -1) {
            System.out.println(NAME_CANNOT_BE_NULL);
        } else if (checkName == -2) {
            System.out.println(NAME_CANNOT_BE_EMPTY);
        } else if (checkName == -3) {
            System.out.println(NAME_CANNOT_CONTAIN_DIGIT);
        } else if (checkName != 0) {
            System.out.println(UNKNOWN_ERROR);
        }

        int checkAge = user.setAge(age);
        if (checkAge == -1) {
            System.out.println(AGE_CANNOT_BE_NEGATIVE);
        } else if (checkAge == -2) {
            System.out.println(AGE_CANNOT_BE_TOO_BIG);
        } else if (checkAge != 0) {
            System.out.println(UNKNOWN_ERROR);
        }
        users.add(user);
    }

    static void findUserIndex(User user) {
        int indexOfUser = users.indexOf(user);
        if (indexOfUser == -1) {
            System.out.printf(NOT_FOUND, user.getName());
        } else {
            System.out.printf(FOUND, user.getName(), users.indexOf(user));
        }
    }

}
class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int setName(String name) {
        if (name == null) { // <--- check for null exception
            return -1;
        } else if (name.isEmpty()) { // <-- check for empty string
            return -2;
        } else if (name.matches(".*\\d.*")) { // <--- check for dots, digits
            return -3;
        } else {
            this.name = name;
            return 0;
        }
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age < 0) { // <--- check for unborn person ;)))
            return -1;
        } else if (age > 150) { // <--- check for undead person
            return -2;
        } else {
            this.age = age;
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { // <--- check if compare this object with itself
            return true;
        }
        if (!(o instanceof User)) { // <--- check if Object isn't class User
            return false;
        }
        User user = (User) o; // <--- Cast class User on object
        return Objects.equals(getName(), user.getName()); // <--- compare its names
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName()); // <--- create hashCode from name of an object
    }
}