package ds.leetcode;

/*
 * How Many Numbers Are Smaller Than the Current Number.
 * */

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{6, 5, 4, 8})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{7, 7, 7, 7})));

    }

    // Brute force approach.
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((i != j) && (nums[i] > nums[j])) {
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }

        return result;
    }
}
