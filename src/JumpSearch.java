// Requires a sorted array
// Finds range for the element's index by incrementing
// the upper and lower bounds by some value: i(k) < element > i(k+1).
// When the bounds are found, a linear search is performed between them.

public class JumpSearch {

    public static int JumpSearcher(int[] intarray, int node, int increment) {
        int lowerBound = 0;
        int upperBound = increment;

        while (!((node >= intarray[lowerBound]) && (node <= intarray[upperBound]))) {
            lowerBound += increment;
            upperBound += increment;
        }
        return LinearSearch.linearSearcher(intarray, node, lowerBound, upperBound);
    }


}
