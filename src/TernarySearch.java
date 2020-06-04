// The Ternary Search works very similarly to the Binary Search, except that it divides the array into three subarrays (insteado of 2)
// Since it has to test whether this node is is any of the three arrays, it has a worst case time complexity slightly higher than binary search.
// This requires a sorted array, and recursively splits the array into three parts and determines which one contains the node.
// If the bounds collapse without a return statement being passed, the node is not contained the array.

public class TernarySearch {

    public  static int TernarySearcher(int[] intArray, int leftBound, int rightBound, int node) {


        int midFirst = leftBound + ((rightBound - leftBound)/3);
        int midSecond = midFirst + ((rightBound - leftBound)/3);

        System.out.println("left bound: " + leftBound);
        System.out.println("midfirst: " + midFirst);
        System.out.println("midSecond: " + midSecond);
        System.out.println("right bound: " + rightBound);
        System.out.println("====================================");

        if (leftBound <= rightBound) {

            if (intArray[midFirst] == node) {
                return  midFirst;
            }

            if (intArray[midSecond] == node) {
                return midSecond;
            }

            if ((node >= intArray[leftBound]) && (node < intArray[midFirst])) {
                return TernarySearcher(intArray, leftBound, midFirst - 1, node);
            }

            if ((node > intArray[midFirst]) && (node < intArray[midSecond])) {
                return TernarySearcher(intArray, midFirst + 1, midSecond - 1, node);
            }

            if ((node > intArray[midSecond]) && (node <= intArray[rightBound])) {
                return TernarySearcher(intArray, midSecond + 1, rightBound, node);
            }
        }

        return  -1;
    }
}
