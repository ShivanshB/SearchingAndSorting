// Works optimally on a small range of numbers.
// Has the largest advantages over other algorithms
// when using decimals --> O(n)
// Sorts array into buckets and then sorts buckets with insertion sort
// Merges Buckets into output array.
// Can only sort for positive values.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static int[] BucketSorter(int[] intArray) {

        int length = intArray.length;

        int[] output = new int[length];

        List<Integer>[] buckets = new List[10];
        for (int i = 0; i < 10; i++) {
            buckets[i] = new ArrayList<>();
        }

       for (int number : intArray) {
           buckets[hash(number)].add(number);
       }

       for (List<Integer> bucket : buckets) {
           Collections.sort(bucket);
       }

       int i = 0;

       for (List<Integer> bucket : buckets) {
           for (int number : bucket) {
               output[i++] = number;
           }
       }

       return output;
    }



    public static int hash (int number) {
        return number/10;
    }
}
