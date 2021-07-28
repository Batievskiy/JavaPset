import java.util.HashMap;
import java.util.Map;

public class MapComputeIfPresentLvl14L8 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("bOne", "aOne");
        books.put("bTwo", "aTwo");
        books.put("bThree", "aThree");
        books.put("bFour", "aFour");
        books.put("bFive", "aFive");
        System.out.println("original -> " + books);

        books.computeIfPresent("bOne", (title, author) -> author="NEW Author");
        books.forEach((title, author) -> System.out.println("title: " + title + " | author: " + author));
    }
}
