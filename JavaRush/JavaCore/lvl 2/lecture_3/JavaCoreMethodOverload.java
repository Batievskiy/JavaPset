public class JavaCoreMethodOverload {
}

class Mark1 {

    private double lensDiameter;

    // default constructor
    public Mark1() {

    }
    // overloaded constructor
    public Mark1(double lensDiameter) {
        this.lensDiameter = lensDiameter;
    }

    public double getLensDiameter() {
        return lensDiameter;
    }
}

class Mark2 extends Mark1 {
    private double lensDiameter;
    private double shutterSpeed;

    public Mark2() {
        super(0);
    }

    // overloaded constructor
    public Mark2(double lensDiameter) {
        super(lensDiameter);
    }

    // overloading constructor
    public Mark2(double lensDiameter, double shutterSpeed) {
        this.lensDiameter = lensDiameter;
        this.shutterSpeed = shutterSpeed;
    }
}