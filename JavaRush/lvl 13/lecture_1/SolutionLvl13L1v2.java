// create primitives from Wrappers
// - using - typeValueWrapper.primitiveValue()
public class SolutionLvl13L1v2 {
    Byte byteValueWrapper;
    Short shortValueWrapper;
    Integer integerValueWrapper;
    Long longValueWrapper;

    Float floatValueWrapper;
    Double doubleValueWrapper;

    Character characterValueWrapper;
    Boolean booleanValueWrapper;

    byte byteValue = byteValueWrapper.byteValue();
    short shortValue = shortValueWrapper.shortValue();
    int intValue = integerValueWrapper.intValue();
    long longValue = longValueWrapper.longValue();

    float floatValue = floatValueWrapper.floatValue();
    double doubleValue = doubleValueWrapper.doubleValue();

    char charValue = characterValueWrapper.charValue();
    boolean booleanValue = booleanValueWrapper.booleanValue();

    public static void main(String[] args) {
        
    }

}
