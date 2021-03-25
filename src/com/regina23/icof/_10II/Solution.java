package com.regina23.icof._10II;

public class Solution {
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] testList = {2, 7, 0};
        for(int t : testList){
            int res = solution.numWays(t);
            System.out.println(res);
        }
    }
}
