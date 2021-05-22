// small problem from JavaRush
// calculate square root fot the number
public class SquareRoot {
    public static void main(String[] args) {
        // let's create some array
        int[] array = {15, 64, 9, 51, 45}; // fill it with numbers
        printSqrt(array); // and print square root using function
    }

    public static void printSqrt(int[] array){
        String elSqrt = "Square root for tne number ";
        for (int i = 0; i < array.length; i++) { // iterate through all array elements
            int element = array[i];
            double elementSqrt = Math.sqrt(element); // using Math.sqrt - returns us square root of the number
            System.out.println(elSqrt + element + " equals " + elementSqrt); // and print each element result
        }
    }
}
