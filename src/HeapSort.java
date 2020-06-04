// Sorts an unsorted array.
// First forms an almost complete binary tree from the array indices.
// Then "deletes" the root of the tree by moving it to the last index.
// Recursively "deletes" the root and "adjusts" the tree until elements are exhausted.
// Then reverses the descending sorted array and returns it.

public class HeapSort {

    public static int[] HeapSort(int[] intArray) {

        if (intArray.length == 0) {
            System.out.println("Heap Empty");
            return null;
        }

        int[] tempArray = new int[intArray.length + 1];

        for (int i = 1; i <= intArray.length; i++) {
            tempArray[i] = intArray[i-1];
            HeapCreate(tempArray, i);
        }


        for (int i = 1; i < tempArray.length - 1; i++) {

            HeapDelete(tempArray, tempArray.length - i);
            HeapAdjust(tempArray, 1,tempArray.length - i - 1);
        }

        return reverseArray(tempArray);

    }

    public static void HeapCreate(int[] intArray, int index) {

        int parentIndex = (int) Math.floor(index/2);

        while ((parentIndex > 0) && (intArray[index] > intArray[parentIndex])) {
            int temp = intArray[parentIndex];
            intArray[parentIndex] = intArray[index];
            intArray[index] = temp;
            index = parentIndex;
            parentIndex = (int) Math.floor(index/2);
        }


    }

    public static void HeapAdjust(int[] intArray, int restoredIndex, int heapLength) {
        int leftChild = restoredIndex * 2;
        int temp = intArray[restoredIndex];


        while (leftChild <= heapLength) {
            if ((leftChild < heapLength) && (intArray[leftChild] < intArray[leftChild + 1])) {
                leftChild++;
            }

            if (temp >= intArray[leftChild]) {
                break;
            }

            intArray[leftChild/2] = intArray[leftChild];
            leftChild *= 2;
        }

        intArray[leftChild/2] = temp;


    }

    public static void HeapDelete(int[] intArray, int HeapLength) {

        int temp = intArray[1];


        intArray[1] = intArray[HeapLength];
        intArray[HeapLength] = temp;

    }

    public static int[] reverseArray(int[] intArray) {

        int[] reversedArray = new int[intArray.length - 1];

        for (int i = 0; i < intArray.length - 1; i++) {
            reversedArray[i] = intArray[intArray.length - 1 -i ];
        }

        return reversedArray;
    }
}
