package com.regina23.algorithm._0322;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int coin : coins) {
            for(int j = coin; j < amount + 1; j++) {
                dp[j] = Math.min(dp[j], dp[j-coin] + 1);
            }
        }
        return dp[amount] != amount +1 ? dp[amount] : -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] coins = new int[] {1, 2, 5};
        int amount = 11;
        System.out.println(solution.coinChange(coins, amount));
    }
}
