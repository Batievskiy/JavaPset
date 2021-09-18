import java.util.ArrayList;
import java.util.stream.Stream;
import java.net.URI;
import java.net.URISyntaxException;

public class StreamClass {
    public static void main(String[] args) throws URISyntaxException {

        // .map() - converts data from one type to another
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<String> stringStream = integerStream1.map(String::valueOf);
        Stream<Integer> integerStream2 = stringStream.map(Integer::parseInt);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("https://google.com");
        arrayList.add("https://linkedin.com");
        arrayList.add("https://facebook.com");

        Stream<URI> uriStream = arrayList.stream().map(str ->
                {
                    try {
                        return new URI(str);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
        );
    }
}
