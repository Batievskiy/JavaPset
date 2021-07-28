import java.util.HashMap;
import java.util.Map;

public class MapMergeLvl14L8 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("bOne", "aOne");
        books.put("bTwo", "aTwo");
        books.put("bThree", "aThree");
        books.put("bFour", "aFour");
        books.put("bFive", "aFive");
        System.out.println("original -> " + books);

        // if key in Map does not exist, or value equals null -> method adds this key / value pair
        // if key exist and value != null -> method change its value (remappingFunction)
        // if remappingFunction returns null -> key is deleting from collection
        books.merge("bTwo", "aTwo", (title, author) -> author + " and ADDED STRING");
        books.forEach((title, author) -> System.out.println("title: " + title + " | author: " + author));
    }
}
