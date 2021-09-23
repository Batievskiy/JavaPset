package sweeper;

// face class to control the game
public class Game {

    private Bomb bomb;

    // game constructor uses arguments as columns and rows number
    public Game(int cols, int rows, int bombs) {
        // here we call our setter for sizes using arguments
        Ranges.setSize(new Coord(cols, rows));
        bomb = new Bomb(bombs);
    }

    public void start() {
        bomb.start();
    }

    // this method tells what to draw on the screen
    public Box getBox(Coord coord) {
        return bomb.get(coord);
    }

}
