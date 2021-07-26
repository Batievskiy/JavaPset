// JavaRush lvl 12 lecture 3 problem
// correct program
public class CarJRLvl12L3 {
    // private static String modelName; // <--- have to be non-static
    private String modelName;
    private int speed;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        // CarJRLvl12L3.modelName = modelName; // <--- use this. instead
        this.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
