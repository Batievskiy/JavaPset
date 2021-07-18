// JavaRush lvl 12 lecture 6
// what mistakes usually beginners do?
// let's find out
import java.util.*;
public class EqualsOrNotEquals {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("Apple", "12");
        CellPhone cellPhone2 = new CellPhone("Apple", "12");
        if (cellPhone1 == cellPhone2) { // <--- incorrect way - using == to compare two objects
            System.out.println("they are equals!");
        }
        if (cellPhone1.equals(cellPhone2)) {
            System.out.println("they are equals!"); // <--- correct way - using .equals()
        }
        if (Objects.equals(cellPhone1, cellPhone2)) {
            System.out.println("they are equals!"); // <--- best way - using null-safe .equals()
        }
    }
}
class CellPhone {
    String vendor;
    String model;

    public CellPhone(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        CellPhone cellPhone = (CellPhone) object;
        return Objects.equals(vendor, cellPhone.vendor) &&
                Objects.equals(model, cellPhone.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vendor, model);
    }
}
