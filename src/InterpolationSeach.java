// Interpolation search is an improvement over binary search when the data is in a near uniform distribution.
// Just as binary search utilizes the fact that the array is sorted, interpolation seach also uses the distribution.
// Interpolation seach makes an accurate first guess based on the data inputted, and then recursively narrows its search
// within the distribution. That is, until the search bounds have a range of one.
// This element is either the one you are looking for, or your element is not in the array.

public class InterpolationSeach {

    public static int InterpolationSearcher(int[] intArray, int lowerBound, int upperBound, int node) {
        while ((lowerBound <= upperBound) && (node <= intArray[upperBound]) && (node >= intArray[lowerBound])) {
            if (upperBound == lowerBound) {
                if (intArray[lowerBound] == node) {
                    return lowerBound;
                }
                return -1;
            }

//            Below is the formula for making the index's estimate based on a distribution formula

            int searchIndex = lowerBound +(int) (((double)(upperBound - lowerBound) / (intArray[upperBound] - intArray[lowerBound])) * (node - intArray[lowerBound]));

            if (intArray[searchIndex] == node) {
                return searchIndex;
            }

            if (intArray[searchIndex] < node) {
                lowerBound = searchIndex + 1;
            }

            if (intArray[searchIndex] > node) {
                upperBound = searchIndex - 1;
            }
        }

        return -1;
    }
}
