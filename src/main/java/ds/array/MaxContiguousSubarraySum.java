package ds.array;

import java.util.Arrays;
import java.util.Collections;

public class MaxContiguousSubarraySum {

    public static void main(String[] args) {

        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxContiguousSubarraySum(array));
    }

    private static int maxContiguousSubarraySum(int[] array) {
        Integer[] tempArray = new Integer[array.length];

        tempArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            tempArray[i] = Math.max(array[i], array[i] + tempArray[i - 1]);
        }

        return Collections.max(Arrays.asList(tempArray));

    }
}
