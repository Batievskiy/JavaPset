// override printInfo() methods in classes Triangle, Rectangle and Circle
// "Треугольник"
// "Прямоугольник"
// "Круг"

public class SolutionLvl18L2v1 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        shape.printInfo();
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}

class Shape {
    public void printInfo() {
        System.out.println("I'm a geometric figure");
    }
    private void cantChangeMe() {
        System.out.println("You can't change me!");
    }
}

class Rectangle extends Shape {
    public void printInfo() {
        System.out.println("I'm Rectangle");
    }
    public void cantChangeMe() {
        System.out.println("You can't change me, but can create new one");
    }
}

class Circle extends Shape {
    public void printInfo() {
        System.out.println("I'm Circle");
    }
}

class Triangle extends Shape {
    public void printInfo() {
        System.out.println("I'm Triangle");
    }
}
