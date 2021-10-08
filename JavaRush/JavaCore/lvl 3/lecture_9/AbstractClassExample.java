public class AbstractClassExample {
    public static void main(String[] args) {
        //create the Object of Rectangle class
        // and using shape class reference
        Shape rectangle = new Rectangle(2, 3, "Rectangle");
        System.out.println("Area of the Rectangle : " + rectangle.area());

        rectangle.moveTo(1, 2);

        System.out.println(" ");

        // create the Object of the Circle class
        Shape circle = new Circle(2, "Circle");
        System.out.println("Area of the Circle : " +circle.area());

        circle.moveTo(2, 4);
    }
}

abstract class Shape {
    // declare variables
    String objectName = " ";

    // constructor
    Shape(String name) {
        this.objectName = name;
    }

    // non-abstract method
    public void moveTo(int x, int y) {
        System.out.println(this.objectName + " "
                + "has been moved to : "
                + " x = " + x + " and y = " + y);
    }

    // abstract method
    abstract public double area();
    abstract public void draw();
}

class Rectangle extends Shape {

    int length;
    int width;

    // constructor
    Rectangle(int length, int width, String name) {
        // create base class object
        super(name);
        this.length = length;
        this.width = width;
    }
    // override abstract methods of the abstract class Shape
    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn");
    }
    // same here with area() method
    @Override
    public double area() {
        return (double) (length * width);
    }
}

class Circle extends Shape {
    double pi = 3.14;
    int radius;

    // constructor
    Circle(int radius, String name) {
        // create base class object
        super(name);
        this.radius = radius;
    }

    // override main class
    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }
    @Override
    public double area() {
        return (double)((pi * radius) / 2);
    }
}


