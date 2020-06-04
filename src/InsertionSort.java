/*
 Insertion Sort is a sorting algorithm that sorts an array.
 It iterates through all subarrays with indices: [0, 1, ..., n]
 Where 0 < n < array.length. The largest element in the subbaray is known as the key.
 This key is tested for being larger than each element below it, and if it it then it is inserted.
 If it is smaller, however, the element below it is moved up, and the key is inserted when the
 above condition is fulfilled.
 O(n) = n^2
*/

public class InsertionSort {

    public static int[] InsertionSorter(int[] intArray) {

        int length = intArray.length;

        for (int i = 1; i < length; i++) {
            int key = intArray[i];
            int j = i - 1;

            while (j >= 0 && intArray[j] > key) {
                intArray[j+1] = intArray[j];
                j = j -1;
            }
            intArray[j+1] = key;
        }
        return intArray;
    }
}
