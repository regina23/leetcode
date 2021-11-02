package icof._17;

import java.lang.Math;
import java.util.Arrays;

public class Solution {
    public int[] printNumber(int n) {
        int max = (int) Math.pow(10, n) - 1;
        int[] nums = new int[max];
        for(int i = 0; i < max; i++) {
            nums[i] = i + 1;
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 1;
        int[] res = solution.printNumber(n);
        System.out.println(Arrays.toString(res));
    }
}