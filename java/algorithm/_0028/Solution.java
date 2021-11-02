package algorithm._0028;

public class Solution {
    public int strStr(String haystack, String needle) {
        // Brute
        int L = haystack.length();
        int n = needle.length();
        for(int i = 0; i < L - n + 1; i++) {
            if(haystack.substring(i, i + n) == needle) {
                return i;
            }
        }
        return -1;




    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "hello";
        String needle = "ll";
        int res = solution.strStr(haystack, needle);
        System.out.println(res);
    }
}
