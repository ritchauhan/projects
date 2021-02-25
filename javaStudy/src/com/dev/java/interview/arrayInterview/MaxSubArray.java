package com.dev.java.interview.arrayInterview;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * For Explanation
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * https://leetcode.com/problems/maximum-subarray/
 *
 *
 */
public class MaxSubArray {
    public int maxSubArrayCalc(int[] A) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum < 0)
                sum = A[i];
            else
                sum += A[i];
            if (sum > max)
                max = sum;
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums1 = {-2, -3, -1};
        MaxSubArray maxSubArray = new MaxSubArray();
        int result = maxSubArray.maxSubArrayCalc(nums1);
        System.out.println(result);

    }
}
