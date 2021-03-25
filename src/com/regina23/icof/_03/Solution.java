package com.regina23.icof._03;

import java.util.*;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test = { 3, 3, 3 };
        int res = solution.findRepeatNumber(test);
        System.out.println(res);
    }
}