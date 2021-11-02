package algorithm._0674;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if(n <= 1) return n;
        int max = 1;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++) {
            if(nums[i] > nums[i-1]) {
                dp[i] = dp[i-1] + 1;
            } else {
                dp[i] = 1;
            }
            max = Math.max(dp[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {1, 3, 5, 4, 7};
        int res = solution.findLengthOfLCIS(nums);
        System.out.println(res);
    }
}
