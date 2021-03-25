package com.regina23.icof._15;

public class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        while(n != 0) {
            cnt += n & 1;  // 与运算判断最右位是0或1
            n >>>= 1;  // 无符号右移1位
        }
        return cnt;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(00000000000000000000000000001011));
    }
}
