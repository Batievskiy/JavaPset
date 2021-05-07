import java.util.Scanner;

// deleting equal strings in array of 10 elements and replace then with null
public class DeleteEqualStrings {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        strings = new String[10];

        for (int i = 0; i < 10; i++) {
            strings[i] = sc.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String stringsCopy = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (stringsCopy == null) {
                    break;
                }
                if (stringsCopy.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
/*
        // another variant to make same deleting duplicates
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i != j && strings[i] != null && strings[j] != null && strings[i].equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        // fancy way to print array
        Arrays.stream(string).forEach(System.out::println);
*/
        for (int i = 0; i < 10; i++) {
            System.out.println(strings[i]);
        }
    }
}
