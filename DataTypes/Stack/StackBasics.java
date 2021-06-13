import java.util.*;

// what is a Stack data base?
// let's find out
public class StackBasics {

    public static int stackHeight = 5;
    public static void main(String[] args) throws InterruptedException {

        /* LIFO - last in, first out
        push(Object element) - Pushes an element on the top of the stack.
        pop() - Removes and returns the top element of the stack.

        push() --> [variable1] --> pop()
                   [variable2]
                   [variable3]
        */

        Stack<Integer> stack = new Stack<>();

        stackPush(stack);
        System.out.println(stack);
        System.out.println();
        stackPrintPeek(stack);
        stackPop(stack);
    }

    // let's make a method to push elements to the stack
    static void stackPush(Stack<Integer> stack) throws InterruptedException {
        for (int i = 0; i < stackHeight; i++) {
            stack.push(i);
            System.out.println("push --> " + i);
            Thread.sleep(1000);
        }
    }

    // let's make a method to pop elements from the stack
    static void stackPop(Stack<Integer> stack) throws InterruptedException {
        System.out.println("pop from a stack: ");

        for (int i = 0; i < stackHeight; i++) {
            Integer y = stack.pop();
            System.out.println("pop --> " + y);
            Thread.sleep(1000);
        }
    }

    // let's make a method to print the top of the stack
    static void stackPrintPeek(Stack<Integer> stack) {
        Integer element = stack.peek();
        System.out.println("top element of the stack: " + element);
    }
}
