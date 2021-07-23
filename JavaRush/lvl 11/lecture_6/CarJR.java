// JavaRush lvl 11 lecture 6
// create method "initialize" for Cars
public class CarJR {
    private String model;
    private int year;
    private String color;

    public static void main(String[] args) {
        CarJR carJR = new CarJR();
    }

    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
