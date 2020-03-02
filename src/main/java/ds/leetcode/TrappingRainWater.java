package ds.leetcode;

/*
 * 42. Trapping Rain Water
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * */

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println("Maximum Rain Water that could be trapped is => " + trap(new int[]{2, 0, 2}));
    }

    public static int trap(int[] height) {
        int result = 0;

        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];

        // Generate leftMax Array from Start to End ( where start is first element of height[0] )
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > leftMax[i - 1])
                leftMax[i] = height[i];
            else
                leftMax[i] = leftMax[i - 1];
        }

        // Generate rightMax Array from End to Start ( where end is last element of height [height.length - 1])
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i] > rightMax[i + 1])
                rightMax[i] = height[i];
            else
                rightMax[i] = rightMax[i + 1];
        }

        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));


        for (int i = 0; i < height.length; i++) {
            result += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return result;
    }
}
