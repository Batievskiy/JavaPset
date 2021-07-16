// JavaRush lvl 11 lecture 5 problem
// in method main -> uncomment one line
// to get true true in output
public class StringCompareJR {

    public static void main(String[] args) {
        String s1 = new String("JavaRush");
        s1 = "JavaRush"; // <-- this one ;)
        String s2 = "JavaRush";
//        s2 = new String("JavaRush");
        String s3 = "JavaRush";
//        s3 = new String("JavaRush");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
