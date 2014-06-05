package plantsmiles;


import java.util.ArrayList;
import java.util.Collections;

public class TwoElementsSumToK {

    public static boolean computeImproved(final ArrayList<Integer> numbers, int sum) {
        Collections.sort(numbers);
        int i=0, j=numbers.size()-1;

        while (i < j) {
            if ((numbers.get(i) + numbers.get(j)) == sum){
                System.out.println("The numbers " +numbers.get(i) + " and " + numbers.get(j) + " add up to " + sum);
                return true;
            }
            else if (numbers.get(i) + numbers.get(j) > sum){
                --j;
            }
            else {
                ++i;
            }
        }

        return false;
    }

    public static boolean compute(final int[] numbers, int sum) {
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers.length; k++) {
                if (i == k) {
                    continue;
                }

                if (numbers[i] + numbers[k] == sum) {
                    System.out.println("The numbers " + numbers[i] + " and " + numbers[k] + " add up to " + sum);
                    return true;
                }
            }
        }

        return false;
    }
}
