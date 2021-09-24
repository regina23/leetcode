package com.regina23.algorithm._0093;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddress(String s) {
        int n = s.length();
        List<String> res = new ArrayList<>();
        if (n < 4 || n > 12) {
            return res;
        }
        Deque<String> path = new ArrayDeque<>(4);
        int splitTimes = 0;
        dfs(s, n, splitTimes, 0, path, res);
        return res;
    }

    /**
     * 判断 s 的子区间 [left, right] 是否是一个ip段
     * @param s
     * @param left
     * @param right
     * @return
     */
    public int judgeIfIpSegment(String s, int left, int right) {
        int len = right - left + 1;
        if(len > 1 && s.charAt(left) == '0') {
            return -1;
        }
        int res = 0;
        for(int i = left; i <= right; i++) {
            res = res * 10 + s.charAt(i) - '0';
        }
        if(res > 255) {
            return -1;
        }
        return res;
    }

    public void dfs(String s, int len, int split, int begin, Deque<String> path, List<String> res) {
        if(begin == len) {
            if(split == 4) {
                res.add(String.join(".", path));
            }
            return;
        }
        if(len - begin < (4 - split) || len - begin > 3 * (4 - split)) {
            return;
        }
        for(int i = 0; i < 3; i++ ){
            if(begin + i >= len) {
                break;
            }

            int ipSegment = judgeIfIpSegment(s, begin, begin + i);
            if(ipSegment != -1) {
                path.addLast(ipSegment + "");
                dfs(s, len, split + 1, begin + i + 1, path, res);
                path.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "25525511125";
        System.out.println(solution.restoreIpAddress(s));
    }
}
