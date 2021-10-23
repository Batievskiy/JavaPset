import java.util.function.Function;

public class GenericsBasic {
    public static void main(String[] args) {

        Function<Integer, Integer> square = (Integer n) -> n * n;
        int num = 5;
        int result = square.apply(num);
        System.out.println("square of " + num + " -> " + result);

        Box box1 = new Box("hello"); // we can store String
        Box box2 = new Box(44); // we can store Integer


        if (box1.getObject() instanceof String) {
            String str = (String) box1.getObject(); // got String from Object box
            System.out.println("instanceof String -> " + str);
        }
        if (box2.getObject().getClass() == Integer.class) {
            int iNumber = (int) box2.getObject(); // got Integer from Object box
            System.out.println("instanceof Integer -> " + iNumber);
        }

        Box<String> stringBoxObject = new Box<>("stringBoxObject");
        System.out.println(stringBoxObject.toString());

        ClassA<A> a = new ClassA<>(new A());
        a.test();

        GenericsBasic.<Integer> print(10);
        GenericsBasic.<String> print("String");
        GenericsBasic.print(33);
        GenericsBasic.print("hello");
        B object = new B();
        GenericsBasic.<B>echo(object);
        GenericsBasic.echo(object);
    }

    // static generic methods
    public static <T> void print(T object) {
        System.out.println(object.toString());
    }
    public static <T extends ITest> void echo(T object) {
        object.print();
    }
}

// generified Box class
class Box<T> {
    private T object;

    public Box(T object) {
        this.setObject(object);
    }

    public T getObject() {
        return object;
    }

    private void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "boxObject -> " + super.getClass();
    }
}

interface ITest {
    void print();
}

interface ITest1 {
    void test1();
}

interface ITest2 {
    void test2();
}

// generified class implements interfaces
class A implements ITest1, ITest2 {
    @Override
    public void test1() {
        System.out.println("test1()");
    }

    @Override
    public void test2() {
        System.out.println("test2()");
    }
}

class ClassA<T extends ITest1 & ITest2> {

    public T object;

    public ClassA(T object) {
        this.object = object;
    }

    public void test() {
        this.object.test1();
        this.object.test2();
    }
}

class B implements ITest {
    private int x = 20;
    @Override
    public void print() {
        System.out.println("x = " + this.x);
    }
}
