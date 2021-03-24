package p03;
import java.util.*;

public class FindRepeatNumber {  
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = { 3, 3, 3 };
        int res = findRepeatNumber(test);
        System.out.println(res);
    }
}