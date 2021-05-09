import java.util.Scanner;

// deleting equal strings in array of N elements and replace then with null
public class DeleteEqualStrings {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = 10;

        strings = new String[arrSize];

        for (int i = 0; i < arrSize; i++) {
            strings[i] = sc.nextLine();
        }

        for (int i = 0; i < arrSize; i++) {
            String stringsCopy = strings[i];
            for (int j = i + 1; j < arrSize; j++) {
                if (stringsCopy == null) {
                    break;
                }
                if (stringsCopy.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        /* fancy way to print array
        Arrays.stream(strings).forEach(System.out::println);
*/
        for (int i = 0; i < arrSize; i++) {
            System.out.println(strings[i]);
        }
    }
}
