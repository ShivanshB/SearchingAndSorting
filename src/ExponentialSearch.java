// Requires a sorted array, and is generally implemented on on very large arrays.
// This is because the fast growth of an exponential search is suited to large amounts of data.
// These situations with lots of data are where exponential search most outperforms other search methods.
// Exponential search looks for the range of indices, 2^k < index < 2^(k+1).
// Once these indices have been found, it does a Binary Search between them.


public class ExponentialSearch {

    public static int ExponentialSearcher(int[] intArray, int lowerBound, int upperBound, int node) {

        if (intArray[0] == node) {
            return 0;
        }

        while (!((lowerBound <= upperBound) && (node >= intArray[lowerBound]) && (node <= intArray[upperBound]))) {
            lowerBound = lowerBound * 2;
            if (upperBound * 2 <= intArray.length - 1) {
                upperBound = upperBound * 2;
            } else {
                upperBound = intArray.length -1;
            }

            System.out.println("Lower Bound: " + lowerBound);
            System.out.println("Upper Bound: " + upperBound);
            System.out.println("=================================");
        }

        System.out.println("Final Lower Bound: " + lowerBound);
        System.out.println("Final Upper Bound: " + upperBound);
        System.out.println("=================================");

        return BinarySearch.binarySearcher(intArray, lowerBound, upperBound, node);
    }
}
