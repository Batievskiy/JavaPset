import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultLvl14L8 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("bOne", "aOne");
        books.put("bTwo", "aTwo");
        books.put("bThree", "aThree");
        books.put("bFour", "aFour");
        books.put("bFive", "aFive");
        System.out.println("original -> " + books);

        String s1 = books.getOrDefault("bOne", "UNKNOWN");
        String s2 = books.getOrDefault("bSeven", "UNKNOWN");
        System.out.println("bOne author -> " + s1);
        System.out.println("bSeven author -> " + s2);
    }
}
