// what is Infinity and how to use it?
// that's the question!
public class Infinity {
    public static void main(String[] args) {

        // we can use double to implement infinity
        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;
        System.out.println(posInf);
        System.out.println(negInf);

        // we can use float to implement infinity
        float positiveInfinity = Float.POSITIVE_INFINITY;
        float negativeInfinity = Float.NEGATIVE_INFINITY;
        System.out.println(positiveInfinity);
        System.out.println(negativeInfinity);

        // we can use division with zero to implement infinity
        System.out.println(1.0 / 0.0);
        System.out.println(-1.0 / 0.0);
        double inF = 1.0 / 0.0;
        double neginF = -1.0 / 0.0;

        // that's all for now.)
    }
}
