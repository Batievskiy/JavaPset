// JavaRush lvl 15 lecture 6

import java.util.Stack;

public class StackJRLvl15L6 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // .push(object) - to add an object into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack -> " + stack);

        System.out.println();

        // .pop() - to get top element from the stack and remove it
        int x = stack.pop();
        System.out.println(".pop() -> " + x);
        System.out.println("stack -> " + stack);
        System.out.println();

        System.out.println(".push(4)");
        stack.push(4);
        System.out.println("stack -> " + stack);
        System.out.println();

        // .peek() - return top element from the stack (not remove it)
        int y = stack.peek();
        System.out.println(".peek() -> " + y);
        System.out.println();

        // .empty() - check is stack empty
        boolean isEmpty = stack.empty();
        System.out.println("stack -> " + stack);
        System.out.println(".empty() -> " + isEmpty);
        System.out.println();

        // .search(object) - return index of an object
        int indexOfOne = stack.search(1);
        System.out.println(".search(1) -> " + indexOfOne);
        System.out.println();
    }
}
