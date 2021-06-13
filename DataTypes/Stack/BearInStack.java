// let's play with `We Bare Bears` in Stack
import java.util.Stack;

public class BearInStack {

    private String myName;
    private String myColor;

    public BearInStack(String name, String color) {
        myName = name;
        myColor = color;
    }

    @Override
    public String toString() {
        return this.myName;
    }

    public static void main(String[] args) {
        System.out.println("---< `We Bare Bears` in Stack >---");
        BearInStack white = new BearInStack("White", "white");
        BearInStack striped = new BearInStack("Striped", "striped");
        BearInStack brown = new BearInStack("Brown", "brown");

        Stack<BearInStack> bearStack = new Stack<>();

        // let all Bears go on Stack
        bearStack.push(white);
        System.out.println("white bear");
        bearStack.push(striped);
        System.out.println("striped bear");
        bearStack.push(brown);
        System.out.println("brown bear");

        // let's check our current Stack
        System.out.println(bearStack);

        System.out.println("pop brown -->");
        bearStack.pop();
        System.out.println(bearStack);
        System.out.println("pop striped -->");
        bearStack.pop();
        System.out.println(bearStack);





    }
}


