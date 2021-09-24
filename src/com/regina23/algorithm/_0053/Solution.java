package com.regina23.algorithm._0053;

public class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = solution.maxSubArray(nums);
        System.out.println(res);
    }
}
