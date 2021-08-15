import java.net.URL;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Files;

public class LoadSaveFromWebLvl16L7 {
    public static void main(String[] args) throws Exception {
        String image = "https://c.tenor.com/FuBSUozfq1MAAAAM/cats-fluffy.gif";
        System.out.println("checked url");
        URL url = new URL(image);
        System.out.println("checked URL creation");
        InputStream input = url.openStream();
        System.out.println("checked InputStream open");

        System.out.println("checked file creation");
        Path path = Path.of("d:\\cat-popcorn.gif");
        Files.copy(input, path);
    }
}
