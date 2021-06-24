// Interview tricky question
// print from start to end without any loop

import java.util.Arrays;
import java.util.BitSet;

public class PrintNoLoopNoRecursive {
    public static void main(String[] args) {

        int startNumber = 1;
        int endNumber = 10;

        // Way 1 - Using Arrays fill
        Object[] num = new Object[endNumber];

        Arrays.fill(num, new Object() {
            int count = 0;

            @Override
            public String toString() {
                return Integer.toString(++count);
            }
        });
        System.out.println(Arrays.toString(num));
        System.out.println();

        // Way 2 - Using BitSet Class
        String set = new BitSet() {{
            set(startNumber, endNumber + 1);
        }}.toString();
        System.out.append(set, startNumber, set.length());
    }
}