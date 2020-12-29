package p17;

import java.lang.Math;
import java.util.Arrays;

public class PrintNumber {
    public static int[] printNumber(int n) {
        int max = (int) Math.pow(10, n) - 1;
        int[] nums = new int[max];
        for(int i = 0; i < max; i++) {
            nums[i] = i + 1;
        }
        return nums;
    }

    public static void main(String[] args) {
        int n = 1;
        int[] res = printNumber(n);
        System.out.println(Arrays.toString(res));
    }
}