import java.util.Map;

public class PacManInterface {
}

interface Saveable {
    void saveToMap(Map<String, Object> map);
    void loadFromMap(Map<String, Object> map);
}

interface Drawable {
    void draw(Screen screen);
}

class PacMan implements Saveable, Drawable {
    @Override
    public void saveToMap(Map<String, Object> map) {

    }

    @Override
    public void loadFromMap(Map<String, Object> map) {

    }

    @Override
    public void draw(Screen screen) {

    }
}

class Screen {

}