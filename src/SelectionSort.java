// Sorts an unsorted array.
// Searches for smallest element from index i to array.length - 1
// Puts this element at the ith position
// Recursively continues until  i = array.length - 2
// It is "-2" because the last element does not need to be searched, since it will automatically be the largest



public class SelectionSort {

    public static int[] SelectionSorter(int[] intArray) {

         int length = intArray.length;
         int iter = length -1;
         int minIndex;

         if (length == 0) {
             System.out.println("Array does not exist.");
             return null;
         } else if (length == 1) {
             return intArray;
         }

         for (int i = 0; i < iter; i++) {

            minIndex = i;

            for (int j = i + 1; j <= iter; j++) {
                if (intArray[j] <  intArray[minIndex]) {
                    minIndex = j;
                }

            }
            swap(intArray, i, minIndex );
         }

        return intArray;
    }

    public static void swap(int[] intArray, int index1, int index2) {
        int temp = intArray[index1];

        intArray[index1] = intArray[index2];
        intArray[index2] = temp;
    }
}
