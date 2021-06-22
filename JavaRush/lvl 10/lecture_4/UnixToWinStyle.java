// JavaRush simple problem
// convert Unix file path style to Windows style

import java.util.Scanner;

public class UnixToWinStyle {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---< Unix file path style to Windows style >---\n");
        System.out.print("enter some Unix file path style (C:/Documents/Files/) -> ");
        String path = sc.nextLine();
        System.out.println();

        // Way 1 - using Array wo swap "/" to "\"
        System.out.println("Way 1 - using Array wo swap \"/\" to \"\\\" ->");
        char[] chars = path.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '/') {
                chars[i] = '\\';
            }
        }
        String result = new String(chars);
        System.out.println("Windows file path style -> " + result);
        System.out.println();

        // Way 2 - using .split(RegEx) and . join(delimiterChar)
        // using RegEx "/" as splitter
        System.out.println("Way 2 - using .split(RegEx) and . join(delimiterChar) ->");
        String[] array = path.split("/");
        // using "\" as delimiter (don't forget escape char "\")
        String result2 = String.join("\\", array);
        System.out.println("Windows file path style -> " + result2);
        System.out.println();

        // Way 3 - using .replace(oldChar, newChar)
        System.out.println("Way 3 - using .replace(oldChar, newChar) ->");
        String result3 = path.replace('/', '\\');
        System.out.println("Windows file path style -> " + result3);
        System.out.println();
    }
}
