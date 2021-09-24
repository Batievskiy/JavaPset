package sweeper;

import java.util.ArrayList;
import java.util.Random;

// this class stores all sizes of the objects and frames
// and coordinates of them
public class Ranges {

    private static Coord size;
    private static ArrayList<Coord> allCoords;
    private static Random random = new Random();

    static void setSize(Coord _size) {
        size = _size;
        allCoords = new ArrayList<Coord>();
        // traverse through all Coordinates and set them
        for (int y = 0; y < size.y; y++) {
            for (int x = 0; x < size.x; x++) {
                allCoords.add(new Coord(x, y));
            }
        }
    }

    public static ArrayList<Coord> getAllCoords() {
        return allCoords;
    }

    public static Coord getSize() {
        return size;
    }

    // check if coordinates in range of size of the 2D array
    static boolean inRange(Coord coord) {
        return coord.x >= 0 && coord.x < size.x &&
                coord.y >= 0 && coord.y < size.y;
    }

    static Coord getRandomCord() {
        return new Coord(random.nextInt(size.x),
                random.nextInt(size.y));
    }

    static ArrayList<Coord> getCoordsAround(Coord coord) {
        Coord around;
        ArrayList<Coord> list = new ArrayList<Coord>();
        for (int x = coord.x - 1; x <= coord.x + 1; x++) {
            for (int y = coord.y - 1; y <= coord.y + 1; y++) {
                if (inRange(around = new Coord(x, y))) {
                    if (!around.equals(coord)) {
                        list.add(around);
                    }
                }
            }
        }
        return list;
    }
}
