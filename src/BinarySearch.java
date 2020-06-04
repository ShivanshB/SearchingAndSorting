// Requires a sorted array.
// Find middle index of array and find element at that index.
// If the middle element is larger than your number, perform the search on the bottom half
// And, vice versa if the middle element is smaller.
// Run this recursively until the bounds of your search have a range of one.
// This last element is either the correct element, or the element is not in the array.

public class BinarySearch {

    public static int binarySearcher(int[] intArray, int leftIndex, int rightIndex, int node) {


        if (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex)/ 2;

            if (intArray[middleIndex] == node) {
                return middleIndex;
            }

            if (intArray[middleIndex] > node) {
                System.out.println("greater than");
                System.out.println("left index: " + leftIndex);
                System.out.println("middle index: " + middleIndex);
                System.out.println("right index: " + rightIndex);
                System.out.println("====================");

                return binarySearcher(intArray, leftIndex, middleIndex - 1, node);
            }

            if (intArray[middleIndex] < node) {
                System.out.println("less than");
                System.out.println("left index: " + leftIndex);
                System.out.println("right index: " + rightIndex);
                System.out.println("====================");

                return binarySearcher(intArray, middleIndex + 1, rightIndex, node);
            }
        }
        return -1;
    }

//while (leftIndex <= rightIndex) {
//        int middleIndex = (leftIndex + rightIndex)/ 2;
//
//        if (intArray[middleIndex] == node) {
//            return middleIndex;
//        }
//
//        if (intArray[middleIndex] > node) {
//            rightIndex = middleIndex -1 ;
//
//        }
//
//        if (intArray[middleIndex] < node) {
//            leftIndex = middleIndex + 1;
//        }
//    }
//        return -1;
//}


}

