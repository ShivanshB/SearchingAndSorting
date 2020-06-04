// Iterate linearly through all elements in an array
// Stop when element itnerating over matches and return it
// If end of the array is reached and element is not found, return -1

public class LinearSearch {

    public static int linearSearcher(int[] intarray, int node, int lowerbound, int upperbound) {

        for (int i = lowerbound; i <= upperbound; i++) {
            if (intarray[i] == node) {
                return i;
            }
        }
        return -1;

    }
}
