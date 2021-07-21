import java.lang.reflect.Field;
import java.util.*;

public class CapacityArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(100);
        Vector<Integer> vector = new Vector<> (100);

        for (int i = 0; i < 125; i++) {
            al.add(i);
            vector.add(i);
        }

        try {
            System.out.println("ArrayList size = " + al.size() + ", capacity = " + getCapacity(al));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int getCapacity(ArrayList<Integer> al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}
