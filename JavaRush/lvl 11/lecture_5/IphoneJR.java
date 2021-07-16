// JavaRush lvl 11 lecture 5 problem
// in class Iphone override -> public boolean equals(Object)
// in method equals(Object) - return true for two equal objects type IphoneJR
// equals(Object) - return false if null been passed

import java.util.Objects;

public class IphoneJR {
    private String model;
    private String color;
    private int price;

    public IphoneJR(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

//    @Override
//    public boolean equals(Object object) {
//        if (this == object) {
//            return true;
//        }
//        if (object == null || getClass() != object.getClass()) {
//            return false;
//        }
//        IphoneJR iphone = (IphoneJR) object;
//        return price == iphone.price &&
//                Objects.equals(model, iphone.model) &&
//                Objects.equals(color, iphone.color);
//    }

    @Override
    public boolean equals(Object object) {
        // passing same object which method been called
        // if references are equals (object equals itself) -> return true
        if (this == object) {
            return true;
        }
        // passing null reference - nothing to compare!
        // object which method been passes isn't null -> return false;
        if (object == null) {
            return false;
        }
        // passing non-Object class
        // does class Object equals class non-Object?
        // depends on developer!
        // but objects are considered equals in general
        // if passed object type non-Object -> return false
        if (!getClass().equals(object.getClass())) {
            return false;
        }
        // we must cast non-Object to Object type
        IphoneJR iphone = (IphoneJR) object;
        // and compare two Objects using .equals() for strings
        return this.model.equals(iphone.model) &&
                this.color.equals(iphone.color) &&
                this.price == iphone.price;
    }

    public static void main(String[] args) {
        IphoneJR iphoneJR1 = new IphoneJR("X", "Black", 999);
        IphoneJR iphoneJR2 = new IphoneJR("X", "Black", 999);

        System.out.println(iphoneJR1.equals(iphoneJR2));
    }
}
