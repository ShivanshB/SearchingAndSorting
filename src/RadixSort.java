// Using the Counting Sort Algorithm, recursively
// countSort the last digit of each element until
// all digits have been used. This uses Counting Sort
// because counting sort is a stable algorithm.
// Without a stable algorithm such as this, the order and
// precedence of higher place value will not matter.
// Crux of the algorithm lies in the fact that the elements only change
// order if they have a larger xth digit, and otherwise say
// in the same order based on the x-1th previous iterations.
// Def: stable sorting algorithm has two equal keys in the same order in the output as the input.

import java.util.Arrays;

public class RadixSort {

    public static int[] RadixSorter(int[] intArray) {
        int max = Arrays.stream(intArray).max().getAsInt();

        System.out.println(max);

        for (int divisor = 1; max/divisor > 0; divisor*=10) {
            CountingSorter(intArray, divisor);
        }

        return intArray;
    }


    public static int[] CountingSorter(int[] intArray, int divisor) {

        int i;

        int[] temp = new int[intArray.length];

        int[] countArray = new int[10];

        for (i = 0; i < intArray.length; i++) {
            countArray[(intArray[i]/divisor)%10]++;
        }

        for (i = 1; i < 10; i++) {
            countArray[i] = countArray[i-1] + countArray[i];
        }

        for (i = intArray.length - 1; i >= 0; i--) {
            temp[countArray[(intArray[i]/divisor)%10] - 1] = intArray[i];
            countArray[(intArray[i]/divisor)%10]--;
        }

        for (i = 0; i < intArray.length; i++) {
            intArray[i] = temp[i];
        }

        System.out.println(Arrays.toString(intArray));

        return intArray;

    }

}
