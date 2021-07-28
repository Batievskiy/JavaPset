import java.util.HashMap;
import java.util.Map;

public class MapComputeIfAbsentLvl14L8 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("bOne", "aOne");
        books.put("bTwo", "aTwo");
        books.put("bThree", "aThree");
        books.put("bFour", "aFour");
        books.put("bFive", "aFive");
        System.out.println("original -> " + books);

        // .computeIfAbsent(key, action) - takes action if key does not exist
        books.computeIfAbsent("bSeven", book -> getAuthor());
        books.forEach((title, author) -> System.out.println(
                "title: " + title + " | author: " + author));
    }
    private static String getAuthor() {
        return "ADDED AUTHOR";
    }
}
