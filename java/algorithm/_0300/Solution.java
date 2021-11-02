package algorithm._0300;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        /*
        dp[i]：考虑前 i 个元素，以第 i 个数字结尾的最长上升子序列的长度
        注意：nums[i] 必须被选取
         */
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        int max = 1;
        for(int i = 1; i < n; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {10, 9, 2, 5, 3, 7, 101, 18};
        int res = solution.lengthOfLIS(nums);
        System.out.println(res);
    }
}
