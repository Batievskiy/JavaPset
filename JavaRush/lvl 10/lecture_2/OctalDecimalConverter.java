// JavaRush problem
// create Octa <-> Decimal converter
public class OctalDecimalConverter {
    public static void main(String[] args) {
        int decimalNumber = 10;
        int octalNumber = 12;

        System.out.println(toOctal(decimalNumber));
        System.out.println(toDecimal(octalNumber));


    }
    public static int toOctal(int decimalNumber) {
        int counter = 0;
        int octal = 0;
        if (decimalNumber <= 0) {
            return octal;
        }
        while (decimalNumber != 0) {
            octal = (int) (octal + (decimalNumber % 8) * Math.pow(10, counter));
            decimalNumber = decimalNumber / 8;
            counter++;
        }
        return octal;
    }
    public static int toDecimal(int octalNumber) {
        int counter = 0;
        int decimal = 0;
        if (octalNumber <= 0) {
            return decimal;
        }
        while (octalNumber != 0) {
            decimal = (int) (decimal + (octalNumber % 10) * Math.pow(8, counter));
            octalNumber = octalNumber / 10;
            counter++;
        }
        return decimal;
    }
}
