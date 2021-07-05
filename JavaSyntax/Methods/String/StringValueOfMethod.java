// what is .valueOf() method in Java?
// let's find out
public class StringValueOfMethod {
    public static void main(String[] args) {
        System.out.println("---< .valueOf() method in Java >---\n");

        // .valueOf() - converts data from its internal form into a human-readable form.
        System.out.println(".valueOf() - converts data from its internal form into a human-readable form ->");
        int iNt = 32;
        long lNg = 1233894924299131356L;
        float fLt = 3.149871578465358F;
        String s1 = String.valueOf(iNt); // from int to String conversion
        String s2 = String.valueOf(lNg); // from long to String
        String s3 = String.valueOf(fLt); // from float to String

        System.out.printf("int %d converted to string -> %s\n", iNt, s1);
        System.out.printf("long %d converted to string -> %s\n", lNg, s2);
        System.out.printf("float %f converted to string -> %s\n", fLt, s3);
    }
}
