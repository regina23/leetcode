package p21;

import java.util.Arrays;

public class Exchage {
    public static int[] exchage(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] % 2 == 1){
                left++;
                continue;
            }
            if(nums[right] % 2 == 0) {
                right--;
                continue;
            }
            if(nums[left] % 2 == 0 && nums[right] % 2 == 1) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
                continue;
            }
        }
        return nums;
        
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,};
        int[] res = exchage(nums);
        System.out.println(Arrays.toString(res));
    }
}