// JavaRush Lvl 13 lecture 1 problem
// create wrapper objects for all primitives
// - using .valueOf(primitive)
public class SolutionLvl13L1 {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    Byte byteValueWrapper = Byte.valueOf(byteValue);
    Short shortValueWrapper = Short.valueOf(shortValue);
    Integer integerValueWrapper = Integer.valueOf(intValue);
    Long longValueWrapper = Long.valueOf(longValue);

    Float floatValueWrapper = Float.valueOf(floatValue);
    Double doubleValueWrapper = Double.valueOf(doubleValue);

    Character characterValueWrapper = Character.valueOf(charValue);
    Boolean booleanValueWrapper = Boolean.valueOf(booleanValue);

    public static void main(String[] args) {

    }
}
