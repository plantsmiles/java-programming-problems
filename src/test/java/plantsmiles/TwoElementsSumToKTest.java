package plantsmiles;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TwoElementsSumToKTest {

    @Test
    public void testBigOnTimeSumToK() {
        final Integer[] numbers = {2,4,5,0,4,1};
        final int sumTo = 6;

        assertTrue(TwoElementsSumToK.computeImproved(new ArrayList<Integer>(Arrays.asList(numbers)), sumTo));
    }

    @Test
    public void testBigOnSquaredSumToK () {
        final int[] numbers = {3,4,5,0,4,1};
        final int sumTo = 6;

        assertTrue(TwoElementsSumToK.compute(numbers, sumTo));
    }
}