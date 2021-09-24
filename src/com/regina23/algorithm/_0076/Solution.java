package com.regina23.algorithm._0076;

public class Solution {
    public String minWindow(String s, String t) {
        if(s == null || s.length() == 0 || t == null || t.length() == 0) return "";
        int need[] = new int[128];  // 记录需要的字符个数
        for(int i = 0; i < t.length(); i++) {
            need[t.charAt(i)] ++;
        }
        int l = 0, r = 0;
        int min = 100000;
        int cnt = t.length();
        int start = 0;
        while( r < s.length()) {
            char c = s.charAt(r);
            if(need[c] > 0) {
                cnt--;
            }
            need[c]--;
            if(cnt == 0) { // 窗口包含t中所元素
                while(l < r && need[s.charAt(l)] < 0){
                    need[s.charAt(l)]++;
                    l++;
                }
                if(r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }
                need[s.charAt(l)]++;
                l++;
                cnt++;
            }
            r++;
        }
        return s.substring(start, start + min);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = solution.minWindow(s, t);
        System.out.println(res);
    }
}
