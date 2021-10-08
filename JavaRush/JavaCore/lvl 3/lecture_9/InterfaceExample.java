public class InterfaceExample {
    public static void main(String[] args) {
        // create the Object of Rectangle class
        // using Shape interface reference
        Shape rectangle = new Rectangle(2, 3);
        System.out.println("Area of the Rectangle : " + rectangle.area());

        // create the Object of the Circle class
        Shape circle = new Circle(2);
        System.out.println("Area of the Circle : " + circle.area());

    }
}

interface Shape {
    // abstract method
    void draw();

    double area();
}

class Rectangle implements Shape {
    int length;
    int width;

    // constructor
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // implement the abstract class
    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn");
    }

    @Override
    public double area() {
        return (double) (length * width);
    }
}

class Circle implements Shape {
    double pi = 3.14;
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    public double area() {
        return (double) ((pi * radius * radius) / 2);
    }
}