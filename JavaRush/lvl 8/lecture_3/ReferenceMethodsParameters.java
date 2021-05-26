// Reference variables as Method Parameters?
// why not
public class ReferenceMethodsParameters {
    public static void main(String[] args) {
        Demo C = new Demo();
        Demo D = new Demo();

        // updating value using primary reference
        D.y = 44;

        C.display(C, D);
        D.display(C, D);
    }
}

class Demo {
    int x = 10;
    int y = 20;

    int display(Demo A, Demo B) {
        // here we update value using argument
        A.x = 77;
        B.y = 44;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        return 0;
    }
}
