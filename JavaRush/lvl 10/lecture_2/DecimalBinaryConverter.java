public class DecimalBinaryConverter {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("decimal number -> " + decimalNumber);
        String binaryNumber = "101";
        System.out.println("binary number -> " + binaryNumber);

        System.out.println("toBinary ->" + toBinary(255));
        System.out.println("toDecimal -> " + toDecimal(binaryNumber));
        System.out.println("binToDec -> " + binToDec(binaryNumber));
        System.out.println(100 % 10);

    }

    public static String toBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();
        if (decimalNumber <= 0) {
            return binary.toString();
        }
        while (decimalNumber != 0) {
            binary.insert(0, decimalNumber % 2);
            decimalNumber /= 2;
        }
        return binary.toString();
    }

    public static int toDecimal(String binaryNumber) {
        int decimal = 0;
        if (binaryNumber == null) {
            return decimal;
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimal += value * Math.pow(2, i);
        }
        return decimal;
    }

    public static int binToDec(String binaryNumber) {
        int decimal = 0;
        if (binaryNumber == null) {
            return decimal;
        }
        int temp = Integer.parseInt(binaryNumber);
        for (int i = 0; i < binaryNumber.length(); i++) {
            int value = temp % 10;
            temp /= 10;
            decimal += value * Math.pow(2, i);
        }
        return decimal;
    }
}
