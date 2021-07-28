import java.util.HashMap;
import java.util.Map;

public class MapReplaceLvl14L8 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("bOne", "aOne");
        books.put("bTwo", "aTwo");
        books.put("bThree", "aThree");
        books.put("bFour", "aFour");
        books.put("bFive", "aFive");
        System.out.println("original -> " + books);

        // .replace(key, oldValue, newValue)
        books.replace("bOne", "aOne", "NEW AUTHOR");

        // .replace(key, newValue)
        books.replace("bTwo", "NEW AUTHOR");
        books.forEach((title, author) -> System.out.println("title: " + title + " | author: " + author));

        // .replaceAll(functionResult)
        books.replaceAll((t, a) -> getCoolWriter());
        books.forEach((title, author) -> System.out.println("title: " + title + " | author: " + author));

    }
    private static String getCoolWriter() {
        return "> Cool Writer <";
    }
}
