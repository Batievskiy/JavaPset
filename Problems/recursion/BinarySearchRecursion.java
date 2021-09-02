public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] numArray = {3, 7, 1, 5, 9};
        int key = 9;
        int keyIndex = BinarySearch(numArray, 0, numArray.length - 1, key);
        if (keyIndex == -1) {
            System.out.println("the number " + key + " is not present in the array");
        } else {
            System.out.println("the number \"" + key + "\" is at the index -> " + keyIndex);
        }
    }

    public static int BinarySearch(int[] numArray, int left, int right, int key) {
        if (right >= left) {
            // calculate mid of the array
            int mid = left + (right - left) / 2;
            // if the key is at the mid, return mid
            if (key == numArray[mid]) {
                return mid;
            }
            // if key < mid, recursively search the left sub-array
            if (key < numArray[mid]) {
                return BinarySearch(numArray, left, mid - 1, key);
            }
            // if key > mid, recursively search the right sub-array
            else {
                return BinarySearch(numArray, mid + 1, right, key);
            }
        }
        // if no element in the array, return -1
        return -1;
    }
}
