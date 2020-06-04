// Counting sort will sort an unsorted array.
// It does this by finding the range of values in the array and counting the
// number of times each element in the array shows up.
// The code modified below sets the min number in the array's count to index 0
// of the count array. (e.g. if the element 4 shows up 12 times in the array, then
// count[4] = 12). This continues until all of the elements have been counted.
// Previous elements of the array are recursively added to give the position of the element
// in the array. The count array is then repeatedly referenced for positions,
// decreasing them every time, until all elements have been placed into the temp array.
// The temp array is then copied into the input Array and returned.
// The below code utilizes the max, min, and range of the array to allow for sorting of
// negative numbers without indexOutOfBounds exceptions.


import java.util.Arrays;

public class CountingSort {

    public static int[] CountingSorter(int[] intArray) {

        int max = Arrays.stream(intArray).max().getAsInt();
        int min = Arrays.stream(intArray).min().getAsInt();
        int range = max - min + 1;

        int[] temp = new int[intArray.length];

        int[] countArray = new int[range];

        for (int i = 0; i < intArray.length; i++) {
            countArray[intArray[i] - min]++;
        }

        for (int i = 1; i <= range - 1; i++) {
            countArray[i] = countArray[i-1] + countArray[i];
        }

        for (int i = 0; i < intArray.length; i++) {
            temp[countArray[intArray[i] - min] - 1] = intArray[i];
            countArray[intArray[i] - min]--;
        }

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = temp[i];
        }

        return intArray;

    }
}
