package plantsmiles;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class SortingProblemsTest{

    @Test
    public void testMergeSortedArrayUsingJava() {
        final Integer[] array1 = {9,5,7,8};
        final Integer[] array2 = {1,10,6};

        System.out.println(Arrays.toString(SortingProblems.combineAndSortUsingJava(array1, array2)));
    }

    @Test
    public void testBinarySearch() {
        final int[] array1 = {9,5,7,8};
        System.out.println(Arrays.binarySearch(array1, 5));
    }
}