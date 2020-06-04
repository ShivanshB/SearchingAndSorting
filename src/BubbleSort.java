// Bubble sort is a sorting algorithm that can sort an Array in ascending or descending order.
// It works by switching consecutive elements until all elements have been consecutively switched.
// The below code contains the flag "sorted" to signal early sorting or termination of the loop.
// This largely increases the best case complexity of the algorithm

public class BubbleSort {

    public static int[] BubbleSorter(int[] intArray) {

        boolean sorted = false;

        for (int i = 0; (i < (intArray.length - 1)) && (!sorted); i++) {

            sorted = true;

            for (int j = 0; j < intArray.length - 1; j++) {

                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                    sorted = false;
                }

            }
        }

        return  intArray;

    }
}
