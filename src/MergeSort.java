// Works by recursively breaking up array into 1 element pieces.
// Then recursively merges these pieces while sorting them.
// Once all of the pieces of the array have been merged and sorted, we
// have a fully sorted array.

public class MergeSort {

    public static int[] MergeSorter(int[] intArray) {
        int lowerBound = 0;
        int upperBound = intArray.length - 1;

        MergeSortSorter(intArray, lowerBound, upperBound);

        return intArray;
    }

    public static void MergeSortSorter(int[] intArray, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int middleIndex = (lowerBound + upperBound)/2;

            MergeSortSorter(intArray, lowerBound, middleIndex);
            MergeSortSorter(intArray, middleIndex + 1, upperBound);

            MergeSortMerger(intArray, lowerBound, middleIndex, upperBound);
        }

    }

    public static void MergeSortMerger(int[] intArray, int lowerBound, int middleIndex, int upperBound) {

        int firstHalfSize = middleIndex - lowerBound + 1;
        int secondHalfSize = upperBound - middleIndex;

        int[] L = new int[firstHalfSize];
        int[] R = new int[secondHalfSize];

        for (int i  = 0; i < firstHalfSize; i++) {
            L[i] = intArray[lowerBound + i];
        }

        for (int j  = 0; j < secondHalfSize; j++) {
            R[j] = intArray[middleIndex + 1 + j];
        }

        int firstHalfIter = 0;
        int secondHalfIter = 0;
        int mergedArrayIndex = lowerBound;

        while ((firstHalfIter < firstHalfSize) && (secondHalfIter < secondHalfSize)) {

            if (L[firstHalfIter] <= R[secondHalfIter]) {
                intArray[mergedArrayIndex] = L[firstHalfIter];
                firstHalfIter++;

            }

            else {
                intArray[mergedArrayIndex] = R[secondHalfIter];
                secondHalfIter++;

            }
            mergedArrayIndex++;
        }

        while (firstHalfIter < firstHalfSize) {
            intArray[mergedArrayIndex] = L[firstHalfIter];
            firstHalfIter++;
            mergedArrayIndex++;
        }

        while (secondHalfIter < secondHalfSize) {
            intArray[mergedArrayIndex] = R[secondHalfIter];
            secondHalfIter++;
            mergedArrayIndex++;
        }


    }

}
