// Sorts arrays by choosing a pivot and recursively
// breaking down the array into two halves, one with
// the elements smaller than the pivot and one with larger.
// This occurs recursively until each "subarray" contains
// only one element and is trivially considered "sorted"
// these results are then merged and formed into a sorted array.

public class QuickSort {

    public static int[] QuickSorter(int[] intArray, int lowerBound, int upperBound) {

         if (lowerBound >= upperBound) {
             return null;
         }

        int partitionIndex = partition(intArray, lowerBound, upperBound);


         QuickSorter(intArray, lowerBound, partitionIndex - 1);
         QuickSorter(intArray, partitionIndex + 1, upperBound);

         return intArray;
    }


    public static int partition(int[] intArray, int lowerBound, int upperBound) {

        int pivot = intArray[lowerBound];

        int lowerIter = lowerBound;
        int upperIter = upperBound;

        while (lowerIter < upperIter) {
            while (intArray[lowerIter] <= pivot && lowerIter < upperBound) {
                lowerIter++;
            }

            while (intArray[upperIter] > pivot) {
                upperIter--;
            }

            if (lowerIter < upperIter) {
                swap(intArray, upperIter, lowerIter);
            }
        }

        intArray[lowerBound] = intArray[upperIter];
        intArray[upperIter] = pivot;


        return upperIter;
    }

    public static void swap(int[] intArray, int upperIndex, int lowerIndex) {
        int temp = intArray[upperIndex];
        intArray[upperIndex] = intArray[lowerIndex];
        intArray[lowerIndex] = temp;
    }
}
