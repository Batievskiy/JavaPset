import java.util.ArrayList;

// JavaRush lvl 13 lecture 7 problem
// correct printAnything(ArrayList)
// to accept amy values in list as a parameter
public class SolutionLvl13L7v2 {

//    to accept any values in a List we don't need to specify diamond <???>
//    public static void printAnything(ArrayList<String> arrayList) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//    }

    public static void printAnything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("hello");
        arrayList.add(77);
        arrayList.add("java");

        printAnything(arrayList);
    }
}
