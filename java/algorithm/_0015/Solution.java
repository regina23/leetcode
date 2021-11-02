package algorithm._0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        if(nums == null || n <= 2) return res;

        Arrays.sort(nums);

        for(int i = 0; i < n - 2; i++) {
            if(nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = - nums[i];
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                if(nums[left] + nums[right] == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;

                } else if(nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}
