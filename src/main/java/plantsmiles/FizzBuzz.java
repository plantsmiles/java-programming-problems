package plantsmiles;

public class FizzBuzz {
    /**
     * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the
     * number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print
     * “FizzBuzz”
     * @return result as StringBuilder
     */
    public static StringBuilder computeFizzBuzz() {
        final StringBuilder result = new StringBuilder(700);

        for (int k = 1; k <= 100; k++) {
            if (k % 15 == 0) {
                result.append("FizzBuzz\n");
            } else if (k % 3 == 0) {
                result.append("Fizz\n");
            } else if (k % 5 == 0) {
                result.append("Buzz\n");
            } else {
                result.append(k);
                result.append("\n");
            }
        }

        return result;
    }
}