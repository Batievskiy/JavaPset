/* JavaRush lvl 11 lecture 3 problem
   Class CarConcern must contain:
   - four private final fields
   - public constructor with three parameters and initialized fields
   - public constructor with two parameters and initialized fields
   - public constructor with one parameter and initialized field
*/
public class CarConcernJR {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcernJR(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcernJR(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Оранжевый";
    }

    public CarConcernJR(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Оранжевый";
    }
}
