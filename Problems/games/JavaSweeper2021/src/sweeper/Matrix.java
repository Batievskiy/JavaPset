package sweeper;

// this is two layer 2D array
// - first layer keeps the boxes
// - second layer keeps the bombs
class Matrix {
    private Box[][] matrix;

    Matrix (Box defaultBox) {
        // create the 2D array size x and y
        matrix = new Box[Ranges.getSize().x][Ranges.getSize().y];
        for (Coord coord : Ranges.getAllCoords()) {
            matrix[coord.x][coord.y] = defaultBox;
        }
    }

    Box get(Coord coord) {
        if (Ranges.inRange(coord)) {
            return matrix[coord.x][coord.y];
        }
        return null;
    }

    void set(Coord coord, Box box) {
        if (Ranges.inRange(coord)) {
            matrix[coord.x][coord.y] = box;
        }
    }
}
