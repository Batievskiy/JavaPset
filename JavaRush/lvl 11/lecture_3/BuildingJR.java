/* JavaRush lvl 11 lecture 3 problem
   Class Building must contain:
   - private field type String
   - not -> any constructors
   - non-static method public void
   initialized with a parameter type String
   - initialize field type must be in method initialize(String)
*/
public class BuildingJR {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        BuildingJR buildingJR = new BuildingJR();
        buildingJR.initialize("Barbershop");
    }
}
