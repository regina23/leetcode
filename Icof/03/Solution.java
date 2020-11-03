package codinginterviews03;
import java.util.*;

class Solution {
    public int findRepeatNumber(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return num;
        }
        return -1;
    }
}