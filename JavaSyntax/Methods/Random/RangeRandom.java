import java.util.Map;
import java.util.TreeMap;

public class RangeRandom {

    public static void main(String[] args) {
        //let's create a Map for storing count of all random numbers been generated
        Map<Integer, Integer> map = new TreeMap<>();

        getMap(map);

        // let's print out all Map in format key=[value]
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(String.format("%d=[%d]", entry.getKey(), entry.getValue()));
        }
    }

    // let's fill Map
    static void getMap(Map<Integer, Integer> map) {
        for (int i = 0; i < 1000; i++) {
            // generate random number in range of -10 to 10
            final Integer randomNumber = randomInRange(-10, 10);

            if (!map.containsKey(randomNumber)) {
                map.put(randomNumber, 1);
            } else {
                map.put(randomNumber, map.get(randomNumber) + 1);
            }
        }
    }

    // let's create randomizer in range from min to max
    static int randomInRange(int min, int max) {
        return (int) (Math.random() * ((max - min)) + min);
    }
}
