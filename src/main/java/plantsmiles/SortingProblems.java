package plantsmiles;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Class contains comparisons in Java's implementation vs manual implementation for common sorting and search algorithms
 */
public class SortingProblems {
    /**
     * Given two arrays of numbers, write a method to combine and sort the two arrays.  Collections.sort is a modified
     * merge sort and guarantees nlogn time
     * @param firstNumbers - first unsorted array of numbers
     * @param secondNumbers - second unsorted array of numbers
     * @return Integer array of combined and sort arrays
     */
    public static Integer[] combineAndSortUsingJava(Integer[] firstNumbers, Integer[] secondNumbers) {
        final ArrayList<Integer> combinedArrays = new ArrayList<Integer>(Arrays.asList(firstNumbers));
        combinedArrays.addAll(Arrays.asList(secondNumbers));

        Collections.sort(combinedArrays);

        return combinedArrays.toArray(new Integer[combinedArrays.size()]);
    }

    /**
     * Given two arrays of numbers, write a method to combine and sort the two arrays.
     * @param a
     * @param b
     * @return
     */
    public static int[] combineArraysAndSort(int[] a, int[] b) {
        //Sort the arrays first
        a = mergeSort(a);
        b = mergeSort(b);

        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
        {
            if (a[i] < b[j])
            {
                answer[k] = a[i];
                i++;
            }
            else
            {
                answer[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length)
        {
            answer[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length)
        {
            answer[k] = b[j];
            j++;
            k++;
        }

        return answer;
    }


    private static int[] mergeSort(int [] list) {
        if (list.length <= 1) {
            return list;
        }

        // Split the array in half
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        // Sort each half
        mergeSort(first);
        mergeSort(second);

        // Merge the halves together, overwriting the original array
        merge(first, second, list);
        return list;
    }

    private static void merge(int[] first, int[] second, int [] result) {
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;

        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
            } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        // copy what's left
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }

    /**
     * Manual binary search implementation
     * @param a - array set to search
     * @param key - value to find
     * @return returns index of element if found, -1 otherwise
     */
    public static int binarySearch(int[] a, int key) {
        if (a.length == 0) {
            return -1;
        }

        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid] > key) {
                high = mid - 1;
            }
            else if (a[mid] < key) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }

    /**
     * Wrapped Java binary search to illustrate difference in manual vs Java's implementation
     * @param a - array set to search
     * @param key - value to find
     * @return returns index of element if found, -1 otherwise
     */
    public static int binarySearchJava(Integer[] a, int key) {
        return Collections.binarySearch(Arrays.asList(a), key);
    }
}
